package com.ab.ComponentMapping;

import javax.persistence.Embeddable;

@Embeddable
public class TemporaryAddress {

	private String tempStreet;
	private String tempArea;
	private String tempCity;
	
	public TemporaryAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TemporaryAddress(String tempStreet, String tempArea, String tempCity) {
		super();
		this.tempStreet = tempStreet;
		this.tempArea = tempArea;
		this.tempCity = tempCity;
	}
	public String getStreet() {
		return tempStreet;
	}
	public void setStreet(String tempStreet) {
		this.tempStreet = tempStreet;
	}
	public String getArea() {
		return tempArea;
	}
	public void setArea(String tempArea) {
		this.tempArea = tempArea;
	}
	public String getCity() {
		return tempCity;
	}
	public void setCity(String tempCity) {
		this.tempCity = tempCity;
	}
	@Override
	public String toString() {
		return "Address [tempStreet=" + tempStreet + ", tempArea=" + tempArea + ", tempCity=" + tempCity + "]";
	}
}
