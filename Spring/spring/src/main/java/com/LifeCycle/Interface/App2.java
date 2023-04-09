package com.LifeCycle.Interface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App2 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
     AbstractApplicationContext c=new ClassPathXmlApplicationContext("com/LifeCycle/Interface/config.xml");
    
     Pepasi p1=(Pepasi)c.getBean("p1");
     System.out.println(p1);
     //Destroy method in AbstractApplicationContext
     c.registerShutdownHook();
     
   
    }
}
