package com.Autowarring.Annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	//@Autowired  {First Tarika}
private Address address;

public Address getAddress() {
	return address;
}
  //@Autowired   {Second tarika}
public void setAddress(Address address) {
	this.address = address;
}


public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

@Autowired
public Emp(Address address) {
	super();
	this.address = address;
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}


}
