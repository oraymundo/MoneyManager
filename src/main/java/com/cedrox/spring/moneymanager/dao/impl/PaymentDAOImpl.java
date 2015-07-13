package com.cedrox.spring.moneymanager.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cedrox.spring.moneymanager.dao.PaymentDAO;
import com.cedrox.spring.moneymanager.model.Payment;



public class PaymentDAOImpl implements PaymentDAO{
	
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
     
    @Override
    public void save(Payment payment) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(payment);
        tx.commit();
        session.close();
    }
 
    @SuppressWarnings("unchecked")
    @Override
    public List<Payment> list() {
        Session session = this.sessionFactory.openSession();
        List<Payment> paymentList = session.createQuery("from Payment").list();
        session.close();
        return paymentList;
    }

}
