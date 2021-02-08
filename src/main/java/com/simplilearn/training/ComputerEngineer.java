package com.simplilearn.training;

import java.util.List;

public class ComputerEngineer {
	
	
	private List<Address> addresses;
	
	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public void WorkForWages() {
		System.out.println("Address Details for Computer Engineers: ");
		for(Address theAddress:addresses) {
			System.out.println(theAddress.getLocation() + "," + theAddress.getZipCode());
		}
		
			
	}
	
	public void callAtFirst() {System.out.println("Bean Initialized");}
	public void callAtLast() {System.out.println("Bean Destroyed");}

}
