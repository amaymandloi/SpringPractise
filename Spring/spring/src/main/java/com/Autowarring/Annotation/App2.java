package com.Autowarring.Annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App2 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );

    AbstractApplicationContext c=new ClassPathXmlApplicationContext("com/Autowarring/Annotation/byNameconfig.xml");
    Emp e1=(Emp)c.getBean("e1");
     System.out.println(e1);
     //Destroy method in AbstractApplicationContext
      c.registerShutdownHook();
     
   
    }
}
