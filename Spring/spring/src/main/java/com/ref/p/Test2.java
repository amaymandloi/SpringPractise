package com.ref.p;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Test2 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
     ApplicationContext c=new ClassPathXmlApplicationContext("com/ref/p/ref1.config.xml");
     Am temp=(Am) c.getBean("amref");
System.out.println(temp.getX());
System.out.println(temp.getOb().getY());
 System.out.println(temp);
    }
}
