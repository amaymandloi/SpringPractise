package com.Annotations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App2 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
     AbstractApplicationContext c=new ClassPathXmlApplicationContext("com/Annotations/config.xml");
    
     Kachori k1=(Kachori)c.getBean("k1");
     System.out.println(k1);
     //Destroy method in AbstractApplicationContext
     c.registerShutdownHook();
     
   
    }
}
