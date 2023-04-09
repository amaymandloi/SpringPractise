package com.standalone.map.collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext c=new ClassPathXmlApplicationContext("com/standalone/map/collections/config.xml");
	     Person person1=c.getBean("person1",Person.class);
	   
	     System.out.println(person1);
	
	
	
	
	
	
	}
	}

