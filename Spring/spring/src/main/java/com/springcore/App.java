package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
     ApplicationContext c=new ClassPathXmlApplicationContext("com/springcore/config.xml");
     Student stud=(Student) c.getBean("stud");
     Student stud1=(Student) c.getBean("stud1");
     Student stud2=(Student) c.getBean("stud2");
     System.out.println(stud);
     
     System.out.println(stud1);
     
     System.out.println(stud2 );
    }
}
