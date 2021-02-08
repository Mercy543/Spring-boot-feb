package com.simplilearn.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
//    	Traditional way of doing thing
//    	Engineer theEngineer = new Engineer();
//       theEngineer.WorkForWages();
    	
//    	The Spring way of calling a method
//    	
//      1. Load the context
//    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//      2.Retrieve Bean from Container
//    	ComputerEngineer  computerEngineer =context.getBean("computerEngineer",ComputerEngineer.class);

    	
//      3. Call the method
//   	computerEngineer.WorkForWages();
    	
    	
    	
    	
//    	1. Load the context in Annotations
   	       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationsContext.xml");
   	 
//   2.Retrieve Bean from Container
   	       AnnotationsEngineer  engineer =context.getBean("annotationsEngineer",AnnotationsEngineer.class);
   	
//   3. Call the method
 	       engineer.WorkForWages();
	
    }
}
