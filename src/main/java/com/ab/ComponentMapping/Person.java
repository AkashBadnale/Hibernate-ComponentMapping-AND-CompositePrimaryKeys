package com.ab.ComponentMapping;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	private int id;
	private String name;
	private String surname;
	
	@Embedded
	private TemporaryAddress address;
	@Embedded
	private PermanentAddress permanentAddress;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, String surname, TemporaryAddress address,PermanentAddress permanentAddress) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.permanentAddress = permanentAddress;
	}
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public TemporaryAddress getAddress() {
		return address;
	}
	public void setAddress(TemporaryAddress address) {
		this.address = address;
	}
	
	public PermanentAddress getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(PermanentAddress permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", address=" + address
				+ ", permanentAddress=" + permanentAddress + "]";
	}
	
}
