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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;

@Entity
@Table(name = "offered_workshop")
public class OfferedWorkshop {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@ManyToOne
	private Workshop workshop;
	






	public List<GraderRequest> getGraderRequests() {
		return graderRequests;
	}


	public void setGraderRequests(List<GraderRequest> graderRequests) {
		this.graderRequests = graderRequests;
	}


	@ManyToMany
	private List<User> users;
	
	
	@OneToMany(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH})
	@Column(name="request_id")
	private List<GraderRequest> graderRequests;
	
	public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}


	@OneToOne
	private Organizer organizer;
	
	private Calendar beginDate;
	private Calendar endDate;
	private String location;
	

	@OneToMany(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="groups_id")
	@Valid
	private List<Group> groups ;

	
	@OneToMany(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH})
	@Column(name="payment_id")
	@Valid
	private List<Payment> payments;

	private int price;
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Workshop getWorkshop() {
		return workshop;
	}


	public void setWorkshop(Workshop workshop) {
		this.workshop = workshop;
	}


	public Calendar getBeginDate() {
		return beginDate;
	}


	public void setBeginDate(Calendar beginDate) {
		this.beginDate = beginDate;
	}


	public Calendar getEndDate() {
		return endDate;
	}


	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}





	public void setGroups(ArrayList<Group> groups) {
		this.groups = groups;
	}



	public void setPayments(ArrayList<Payment> payments) {
		this.payments = payments;
	}


	public List<Group> getGroups() {
		return groups;
	}


	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}


	public List<Payment> getPayments() {
		return payments;
	}


	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}





	public Organizer getOrganizer() {
		return organizer;
	}


	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
}
