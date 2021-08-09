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
@Table(name="installment_payment")
@PrimaryKeyJoinColumn(name = "id")
public class InstallmentPayment extends Payment {


	
	@OneToMany(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH})
	@Column(name="installment_id")
	@Valid
	private List<Installment> installments ;

	public List<Installment> getInstallments() {
		return installments;
	}

	public void setInstallments(List<Installment> installments) {
		this.installments = installments;
	}
	
}
