package com.ab.ComponentMapping;

import javax.persistence.Embeddable;

@Embeddable
public class PermanentAddress {
	private String permanentStreet;
	private String permanentArea;
	private String permanentCity;
	public PermanentAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PermanentAddress(String permanentStreet, String permanentArea, String permanentCity) {
		super();
		this.permanentStreet = permanentStreet;
		this.permanentArea = permanentArea;
		this.permanentCity = permanentCity;
	}
	public String getStreet() {
		return permanentStreet;
	}
	public void setStreet(String permanentStreet) {
		this.permanentStreet = permanentStreet;
	}
	public String getArea() {
		return permanentArea;
	}
	public void setArea(String permanentArea) {
		this.permanentArea = permanentArea;
	}
	public String getCity() {
		return permanentCity;
	}
	public void setCity(String permanentCity) {
		this.permanentCity = permanentCity;
	}
	@Override
	public String toString() {
		return "PermanentAddress [permanentStreet=" + permanentStreet + ", permanentArea=" + permanentArea + ", permanentCity=" + permanentCity + "]";
	}
	
	
}
