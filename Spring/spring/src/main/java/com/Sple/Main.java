package com.Sple;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.springcore.Student;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 ApplicationContext c=new ClassPathXmlApplicationContext("com/Sple/config.xml");
	     Demo demo=(Demo) c.getBean("demo");
	     System.out.println(demo);
	}

}
