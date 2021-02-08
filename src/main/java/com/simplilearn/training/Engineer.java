package com.simplilearn.training;

public class Engineer {
	
	private String name;
	
	private int id;
	
	private Address theAddress;
	
	
	public Address getTheAddress() {
		return theAddress;
	}



	public void setTheAddress(Address theAddress) {
		this.theAddress = theAddress;
	}



	public Engineer(String name, int id) {
		//System.out.println("Constructor is called....");
		this.name = name;
		this.id = id;
	}



	public String getName() {
		return name;
	}



/*	public void setName(String name) {
		System.out.println("Setter for name called......");  
		this.name = name;
	}*/



	public int getId() {
		return id;
	}


/*
	public void setId(int id) {
		System.out.println("Setter for id called.....");
		this.id = id;
	}*/



	void WorkForWages() {
		System.out.println("Engineer Name : " + this.getName());
		System.out.println("Engineer ID : " + this.getId());
		System.out.println("Engineer Address : " + this.getTheAddress().getLocation()  + "," + this.getTheAddress().getZipCode());
		}
}
