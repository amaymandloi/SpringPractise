package com.cons.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class Test4 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
     ApplicationContext c=new ClassPathXmlApplicationContext("com/cons/ref/cons.config.xml");
     Perso temp=(Perso) c.getBean("person");
     System.out.println(temp);
     
     //Addition Method
     Addition temp1=(Addition) c.getBean("add");
     temp1.doSum();
    }
}
