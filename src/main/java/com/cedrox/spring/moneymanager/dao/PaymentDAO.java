package com.cedrox.spring.moneymanager.dao;

import java.util.List;

import com.cedrox.spring.moneymanager.model.Payment;



public interface PaymentDAO {
	public void save(Payment payment);
    public List<Payment> list();
}
