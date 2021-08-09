package com.hellokoding.auth.entity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "user")
public class User {
	public User() {
		
		this.contactPoints = new ArrayList<ContactPoint>();
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@NotNull(message = "This field is required")
	@Size(min=1 , message = "This field is required")
    private String firstname;
	
	@NotNull(message = "This field is required")
	@Size(min=1 , message="This field is required")
	private String lastname;
	
	@OneToMany
	private List<Role> roles;
	
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@ManyToMany(mappedBy = "users")
	private List<OfferedWorkshop> offeredWorkshops;

	public List<OfferedWorkshop> getOfferedWorkshops() {
		return offeredWorkshops;
	}

	public void setOfferedWorkshops(List<OfferedWorkshop> offeredWorkshops) {
		this.offeredWorkshops = offeredWorkshops;
	}




	@OneToMany(
			   cascade= {CascadeType.PERSIST, 
						 CascadeType.DETACH, CascadeType.REFRESH , CascadeType.REMOVE})
	@Column(name="contact_id")
	@Valid
	private List<ContactPoint> contactPoints ;
	
	public String getContactPointsEmail() {
		if(contactPoints.isEmpty() == true)
			return null;
		
		for (ContactPoint contactPoint : contactPoints) {
			if ( contactPoint.getType() == ContactType.EMAIL && contactPoint.getRelation() == ContactRelation.SELF ) {

				return contactPoint.getContactData();
			}
			
		}
		return null;
		
	}

	public void setContactPointsEmail(String contactPointsEmail) {
		if ( getContactPointsEmail() == null ) {
		ContactPoint contactPoint = new ContactPoint();
		contactPoint.setRelation(ContactRelation.SELF);
		contactPoint.setType(ContactType.EMAIL);
		contactPoint.setContactData(contactPointsEmail);
		
		contactPoints.add(contactPoint);
		} 

	}
	
	public String getContactPointsPhoneNumber() {
		if(contactPoints.isEmpty() == true)
			return null;
		
		for (ContactPoint contactPoint : contactPoints) {
			if ( contactPoint.getType() == ContactType.PHONE_NUMBER && contactPoint.getRelation() == ContactRelation.SELF ) {
		
				return contactPoint.getContactData();
			}
			
		}
		return null;
	
		
	}

	public void setContactPointsPhoneNumber(String contactPointsEmail) {
			
		ContactPoint contactPoint = new ContactPoint();
		contactPoint.setRelation(ContactRelation.SELF);
		contactPoint.setType(ContactType.PHONE_NUMBER);
		contactPoint.setContactData(contactPointsEmail);
		
		contactPoints.add(contactPoint);

	}
	
	public String getContactPointsAddress() {
		if(contactPoints.isEmpty() == true)
			return null;
		for (ContactPoint contactPoint : contactPoints) {
			if ( contactPoint.getType() == ContactType.ADDRESS && contactPoint.getRelation() == ContactRelation.SELF ) {
		
				return contactPoint.getContactData();
			}
			
		}
		return null;
	}

	public void setContactPointsAddress(String contactPointsEmail) {
			
		ContactPoint contactPoint = new ContactPoint();
		contactPoint.setRelation(ContactRelation.SELF);
		contactPoint.setType(ContactType.ADDRESS);
		contactPoint.setContactData(contactPointsEmail);
		
		contactPoints.add(contactPoint);

	}
	
	public String getContactPointsFatherPhoneNumber() {
		if(contactPoints.isEmpty() == true)
			return null;
		for (ContactPoint contactPoint : contactPoints) {
			if ( contactPoint.getType() == ContactType.PHONE_NUMBER && contactPoint.getRelation() == ContactRelation.FATHER_MOBILE ) {
		
				return contactPoint.getContactData();
			}
			
		}
		return null;
	}

	public void setContactPointsFatherPhoneNumber(String contactPointsEmail) {
			
		ContactPoint contactPoint = new ContactPoint();
		contactPoint.setRelation(ContactRelation.FATHER_MOBILE);
		contactPoint.setType(ContactType.PHONE_NUMBER);
		contactPoint.setContactData(contactPointsEmail);
		
		contactPoints.add(contactPoint);

	}



	
	private Calendar birthDate;
   
    private Nationality nationality;
    private Gender gender;
    

	@NotNull(message = "This field is required")
	@Size(min=1 , message = "This field is required")
    private String nationalCode;

	@NotNull(message = "This field is required")
	@Size(min=1 , message = "This field is required")
    private String bestFriendName; 


    @Size(min=6 , max=32 , message = "It must be between 6 and 32 characters")
    private String username;
   
//
//	@NotNull(message = "This field is required")
//	@Size(min=8,max=32 , message = "It must be between 8 and 32 characters")
    private String password;

    @Transient
//	@NotNull(message = "This field is required")
//	@Size(min=1 , message = "This field is required")
    private String passwordConfirm;

    


    
   
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	public String getBirthDate() {
		if ( birthDate == null )
			return null;
		
		String year = Integer.toString(birthDate.get(Calendar.YEAR));
		String month = Integer.toString(birthDate.get(Calendar.MONTH));
		String day = Integer.toString(birthDate.get(Calendar.DAY_OF_MONTH));
		
		if ( month.length() < 2 ) {
			month = "0"+month;
		}
		
		if ( day.length() < 2 ) {
			day = "0" + day;
		}
		
		String string =   year + "-" + month+ "-"+ day ;
		

		return string;
	}




	public void setBirthDate(String birthDateStr) {
		if ( birthDateStr == null )
		{
			this.birthDate = null;
			return;
		}
		
		System.out.println("Date: "+birthDateStr);
		
		String day = birthDateStr.substring(8, 10);
		String month = birthDateStr.substring(5, 7);
		String year = birthDateStr.substring(0,4);
		
		Calendar calendar = Calendar.getInstance();  
		calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
		calendar.set(Calendar.MONTH, Integer.parseInt(month));
		calendar.set(Calendar.YEAR, Integer.parseInt(year));

		
				this.birthDate = calendar;
	
	}

	public List<ContactPoint> getContactPoints() {
		return contactPoints;
	}

	public void setContactPoints(List<ContactPoint> contactPoints) {
		this.contactPoints = contactPoints;
	}

	public Nationality getNationality() {
		return nationality;
	}

	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}

	public String getNationalCode() {
		return nationalCode;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setNationalCode(String nationalCode) {
		this.nationalCode = nationalCode;
	}

	

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }




	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		
//		if ( gender.equals(Gender.FEMALE.name()) ) {
//			this.gender = Gender.FEMALE;
//		}
//		if ( gender.equals(Gender.MALE.name()) ) {
//			this.gender = Gender.MALE;
//		}
//		if ( gender.equals(Gender.OTHER.name()) ) {
//			this.gender = Gender.OTHER;
//		}
//		
		this.gender = gender;
	}

	public String getBestFriendName() {
		return bestFriendName;
	}

	public void setBestFriendName(String bestFriendName) {
		this.bestFriendName = bestFriendName;
	}
}
