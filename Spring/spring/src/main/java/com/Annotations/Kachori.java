package com.Annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Kachori {
private double prize;

public double getPrize() {
	return prize;
}

public void setPrize(double prize) {
	this.prize = prize;
}

public Kachori() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Kachori [prize=" + prize + "]";
}
@PostConstruct
public void start()
{
	System.out.println("Start");
}
@PreDestroy
public void end()
{
	System.out.println("End");
}
}
