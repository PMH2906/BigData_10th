package com.mouse.model;

public class Mouse {
	private int id;
	private String name;
	private String country;
	private String address;
	
	// @NoArgsConstructor
	public Mouse() {
		
	}

	public Mouse(int id, String name, String country, String address) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.address = address;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Mouse [id=" + id + ", name=" + name + ", country=" + country + ", address=" + address + "]";
	}
	
	
}
