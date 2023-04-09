package com.Spring.LifeCycle;

public class Samosa {
private double prize;

public double getPrize() {
	return prize;
}

public void setPrize(double prize) {
	this.prize = prize;
}

public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Samosa [prize=" + prize + "]";
}
public void init()
{
	System.out.println("Inside Init Method");
}
public void destroy()
{
	System.out.println("Inside destroy method");
}

}
