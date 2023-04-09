package com.Stereotype.Annotations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext c=new ClassPathXmlApplicationContext("com/Stereotype/Annotations/config.xml");
	   
	Student student=(Student) c.getBean("student");
	   
	System.out.println(student);	
	}
	}

