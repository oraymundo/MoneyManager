package com.cedrox.spring.moneymanager.model;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Payment")
public class Payment {
	@Id
	@Column(name = "uuid")
	@org.hibernate.annotations.Type(type="pg-uuid")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID uuid;

	private String name;
	
	private Date date;
	
	private Double value;

	public UUID getUuid() {
		return uuid;
	}

	public void setUuId(UUID uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Calendar getDate() {
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		return cal;
	}
	
	public void setDate(Calendar cal) {
		this.date = new java.sql.Date(cal.getTime().getTime());;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "uuid=" + uuid + ", name=" + name + ", date=" + date;
	}

}
