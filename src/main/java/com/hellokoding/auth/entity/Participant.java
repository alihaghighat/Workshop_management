package com.hellokoding.auth.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.Valid;

@Entity
@Table(name = "participant")
@PrimaryKeyJoinColumn(name = "id")
public class Participant extends Role implements FormTaker{


	
	
	
	
}
