package com.app.repositories.payment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.payment.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
