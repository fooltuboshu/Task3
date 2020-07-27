package com.hibernate.com.lisst;

import java.util.Map;

public class Emp {
	private String id;
	private String name;
	private Map<String, Address> address; // 

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public Map<String, Address> getAddress() {
			return address;
		}

	public void setAddress(Map<String, Address> address) {
		this.address = address;
	}
	
	
	public Emp() {
		System.out.println("Employee Object Created");
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
