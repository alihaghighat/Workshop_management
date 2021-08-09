package com.hellokoding.auth.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="organizer")
@PrimaryKeyJoinColumn(name = "organizer_id")
public class Organizer extends Role implements Answerable {
	
	
	
	

}
