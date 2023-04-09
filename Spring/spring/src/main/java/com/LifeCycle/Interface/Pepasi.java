package com.LifeCycle.Interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepasi implements InitializingBean, DisposableBean {
private double prize;

public double getPrize() {
	return prize;
}

public void setPrize(double prize) {
	this.prize = prize;
}

public Pepasi() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Pepasi [prize=" + prize + "]";
}

public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("init method");
	
}

public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Destroy method"); 
}

}
