package com.hellokoding.auth.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



@Entity
@Table(name="graders")
@PrimaryKeyJoinColumn(name = "graders_id")
public class Grader extends Role implements Answerable {

	
	
	
	
}
