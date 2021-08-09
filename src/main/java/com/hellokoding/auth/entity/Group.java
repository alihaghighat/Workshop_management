package com.hellokoding.auth.entity;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;

@Entity
@Table(name="workshop_groups")
public class Group implements FormTaker {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
	@OneToMany(
			   cascade= {CascadeType.PERSIST, CascadeType.MERGE,
						 CascadeType.DETACH, CascadeType.REFRESH})
	@Valid
	@Column(name="grader_id")
	private List<Grader> graders ;
	
	@OneToMany(
			   cascade= {CascadeType.PERSIST, CascadeType.MERGE,
						 CascadeType.DETACH, CascadeType.REFRESH})
	@Valid
	@Column(name="participant_id")
	private List<Participant> participants;
	
	public List<Participant> getParticipants() {
		return participants;
	}


	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}


	private long supervisor_id;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public List<Grader> getGraders() {
		return graders;
	}


	public void setGraders(List<Grader> graders) {
		this.graders = graders;
	}


	public long getSupervisor_id() {
		return supervisor_id;
	}


	public void setSupervisor_id(long supervisor_id) {
		this.supervisor_id = supervisor_id;
	}
	
	
	
	
	
	

}
