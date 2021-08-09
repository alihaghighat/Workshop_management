package com.hellokoding.auth.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


public class OfferedForm {
	
	private Long id;
	
	private List<Answer> answers;

	private FormTaker formTaker;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public FormTaker getFormTaker() {
		return formTaker;
	}

	public void setFormTaker(FormTaker formTaker) {
		this.formTaker = formTaker;
	}
	
	
}
