package com.klef.jfsd.exam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_table")
public class Customer 
{
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="customer_id")
     private int id;
     @Column(name="customer_name",nullable=false,length = 50)
     private String name;
     @Column(name="customer_dob",nullable=false,length = 10)
     private String dob;
     @Column(name="customer_email",nullable=false,unique = true,length = 30)
     private String email;
     @Column(name="customer_address",nullable=false)
     private String address;
     @Column(name="customer_contactno",nullable=false,unique = true)
     private String contactno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
  }