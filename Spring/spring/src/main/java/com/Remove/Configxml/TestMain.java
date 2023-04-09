package com.Remove.Configxml;

import java.io.ObjectInputStream.GetField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext c= new AnnotationConfigApplicationContext(JavaConfig.class);
Student student =(Student) c.getBean("student");
System.out.println(student);
student.study();
	}

}
