package com.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Test1 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
     ApplicationContext c=new ClassPathXmlApplicationContext("com/reference/ref.config.xml");
     A temp=(A) c.getBean("aref");
System.out.println(temp.getX());
System.out.println(temp.getOb().getY());
 System.out.println(temp);
    }
}
