package com.hellokoding.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellokoding.auth.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
