package com.hellokoding.auth.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="workshop_relation")
public class WorkshopRelation {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long workshop_relation_id;
	
    @ManyToOne
	private Workshop preRequired ;

	public long getWorkshop_relation_id() {
		return workshop_relation_id;
	}

	public void setWorkshop_relation_id(long workshop_relation_id) {
		this.workshop_relation_id = workshop_relation_id;
	}

	public Workshop getPreRequired() {
		return preRequired;
	}

	public void setPreRequired(Workshop preRequired) {
		this.preRequired = preRequired;
	}
	
    
    
	
    
	
	
	
	
}
