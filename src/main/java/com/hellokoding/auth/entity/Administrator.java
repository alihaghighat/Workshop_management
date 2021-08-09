package com.hellokoding.auth.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="administrator")
@PrimaryKeyJoinColumn(name = "id")
public class Administrator extends Role {

	
	
	
}

