package com.Stereotype.Annotations.Collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext c=new ClassPathXmlApplicationContext("com/Stereotype/Annotations/Collections/config.xml");
	     Student student=(Student) c.getBean("student");
	   
	System.out.println(student);
	System.out.println(student.getAddress());
	System.out.println(student.getAddress().getClass().getName());

	
	
	
	
	
	
	
	}
	}

