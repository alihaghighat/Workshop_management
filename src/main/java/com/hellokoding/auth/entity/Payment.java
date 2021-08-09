package com.hellokoding.auth.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="payment")
@Inheritance(strategy = InheritanceType.JOINED)
public class Payment {

	public Payment() {
		this.isPayed = false;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long  payment_id;
	
	protected boolean isPayed ;
	protected long amount;
	
	@OneToOne
	protected Participant participant;
	
	public Participant getParticipant() {
		return participant;
	}
	

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public Long getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(Long payment_id) {
		this.payment_id = payment_id;
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

	public void setAmount(long amount) {
		this.amount = amount;
	}


	
	
	
	
	
}
