package com.Bean.Scope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext c=new ClassPathXmlApplicationContext("com/Bean/Scope/config.xml");
	     Student student=(Student) c.getBean("student");
	      System.out.println(student.hashCode());
	
	     Student student1=(Student) c.getBean("student1");
	     System.out.println(student1.hashCode());

	
	
	
	
	
	
	
	}
	}

