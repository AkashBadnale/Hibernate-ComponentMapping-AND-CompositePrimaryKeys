package com.ab.compositePrimaryKeys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Citizen  implements Serializable{

	private static final long serialVersionUID = -3981774087774871555L;
	
	@Id
	@Column(name="AADHAR")
	private long aadharNumber;
	@Id
	@Column(name="PASSPORT")
	private long passportNumber;
	@Column(name="NAME")
	private String name;
	@Column(name="SURNAME")
	private String surname;
	
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Citizen(long aadharNumber, long passportNumber, String name, String surname) {
		super();
		this.aadharNumber = aadharNumber;
		this.passportNumber = passportNumber;
		this.name = name;
		this.surname = surname;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public long getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(long passportNumber) {
		this.passportNumber = passportNumber;
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
	@Override
	public String toString() {
		return "Citizen [aadharNumber=" + aadharNumber + ", passportNumber=" + passportNumber + ", name=" + name
				+ ", surname=" + surname + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (aadharNumber ^ (aadharNumber >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (passportNumber ^ (passportNumber >>> 32));
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Citizen other = (Citizen) obj;
		if (aadharNumber != other.aadharNumber)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (passportNumber != other.passportNumber)
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	
	
}//Citizen
