package com.cons.ref;

public class Addition {
private int a;
private int b;
public Addition(int a, int b) {
	this.a = a;
	this.b = b;
	System.out.println("Construcot:int , int");
}
public Addition(double a, double b) {
	this.a =(int) a;
	this.b =(int) b;
	System.out.println("Construcot:double , Double");
}	

public Addition (String a, String b) {
this.a = Integer.parseInt(a);
this.b =Integer.parseInt(b);
System.out.println("Construcot:String , String");
}

public void doSum()
{
	System.out.println("Sum is=" +(this.a + this.b));
	
	System.out.println("Value of a"+"-"+a);
	System.out.println("value of b"+"-"+b);
}
}
