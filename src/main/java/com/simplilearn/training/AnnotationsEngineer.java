package com.simplilearn.training;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnnotationsEngineer {

/*	@Autowired
	@Qualifier("secondAddress")*/
	
	@Resource(name="address")
   private Address theAddress;	
	
	public Address getTheAddress() {
	return theAddress;
}
     
//    public void setTheAddress(Address theAddress) {
//    this.theAddress = theAddress;
//}

	public void WorkForWages() {System.out.println("Address details for the Engineer:"
			+ this.getTheAddress().getLocation() + "," + this.getTheAddress().getZipCode());}
	
	@PostConstruct
	public void callAtFirst() {System.out.println("AnnotationEngineer Bean Initialized");}
	
	@PreDestroy
	public void callAtLast() {System.out.println("AnnotationEngineer Bean Destroyed");}

}
