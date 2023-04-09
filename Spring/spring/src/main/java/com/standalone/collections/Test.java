package com.standalone.collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext c=new ClassPathXmlApplicationContext("com/standalone/collections/config.xml");
	     Person person=(Person) c.getBean("person");
	   
	System.out.println(person);
	System.out.println("----------------------------------------------------");
	System.out.println(person.getProps());
	
	
	
	
	
	
	
	}
	}

