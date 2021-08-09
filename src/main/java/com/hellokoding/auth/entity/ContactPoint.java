package com.hellokoding.auth.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="contact_point")
public class ContactPoint {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contact_id;
	
	

	
	public Long getContact_id() {
		return contact_id;
	}
	public void setContact_id(Long contact_id) {
		this.contact_id = contact_id;
	}

	private ContactRelation relation;

	private ContactType type;
	
	private  String contactData;



	public ContactRelation getRelation() {
		return relation;
	}
	public void setRelation(ContactRelation relation) {
		this.relation = relation;
	}
	public ContactType getType() {
		return type;
	}
	public void setType(ContactType type) {
		this.type = type;
	}
	public String getContactData() {
		return contactData;
	}
	public void setContactData(String contactData) {
		this.contactData = contactData;
	}
	
}
