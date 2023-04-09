package com.Spring.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App1 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
     AbstractApplicationContext c=new ClassPathXmlApplicationContext("com/Spring/LifeCycle/config.xml");
    
     Samosa s1=(Samosa)c.getBean("s1");
     System.out.println(s1);
     //Destroy method in AbstractApplicationContext
     c.registerShutdownHook();
   
    }
}
