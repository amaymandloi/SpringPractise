package com.Autowarring.Xml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App2 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    
    //{byType it's mean check package and class name} 
    // AbstractApplicationContext c=new ClassPathXmlApplicationContext("com/Autowarring/Xml/byTypeconfig.xml");
    
    //{constructor type}
    //  AbstractApplicationContext c=new ClassPathXmlApplicationContext("com/Autowarring/Xml/Constructorconfig2.xml");
    	
    //{byName it's means check refernce variable name } 
    AbstractApplicationContext c=new ClassPathXmlApplicationContext("com/Autowarring/Xml/byNameconfig.xml");
    Emp e1=(Emp)c.getBean("e1");
     System.out.println(e1);
     //Destroy method in AbstractApplicationContext
      c.registerShutdownHook();
     
   
    }
}
