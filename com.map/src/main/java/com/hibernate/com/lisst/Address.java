package com.hibernate.com.lisst;

public class Address {
	private String aid;
	private String street;
	private String zipcode;
	
	public Address() {
		System.out.println("Addres Object Created");
	}

	public Address(String aid, String street, String zipcode) {
		super();
		this.aid = aid;
		this.street = street;
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [id=" + aid + ", street=" + street + ", zipcode=" + zipcode + "]";
	}

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	
	
}
