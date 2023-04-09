package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class Test3 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
     ApplicationContext c=new ClassPathXmlApplicationContext("com/constructor/constructor.config.xml");
     Person temp=(Person) c.getBean("person");
     System.out.println(temp);
    }
}
