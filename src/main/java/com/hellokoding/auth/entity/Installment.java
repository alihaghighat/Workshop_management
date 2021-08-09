package com.hellokoding.auth.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="installment")
public class Installment {
	
	public Installment() {
		this.isPayed = false;
	}

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	private long amount;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isPayed() {
		return isPayed;
	}

	public void setPayed(boolean isPayed) {
		this.isPayed = isPayed;
	}


	public long getAmount() {
		return amount;
	}

	public void setAmount(long l) {
		this.amount = l;
	}


	private boolean isPayed ;
	
}