package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Test 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
     ApplicationContext c=new ClassPathXmlApplicationContext("com/collection/collection.config.xml");
     Employes emp=(Employes) c.getBean("emp");
     System.out.println(emp.getName());
     System.out.println(emp.getPhones());
     System.out.println(emp.getAddress());
     System.out.println(emp.getCourses());
     System.out.println(emp.getProps());
    }
}
