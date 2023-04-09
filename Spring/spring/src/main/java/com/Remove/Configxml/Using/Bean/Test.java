package com.Remove.Configxml.Using.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

public static void main(String[] args) {
	ApplicationContext c=new AnnotationConfigApplicationContext(JavaConfig.class);
	Student student=(Student) c.getBean("getStudent");
System.out.println(student);
student.study();
}
}
