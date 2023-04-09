package com.Autowarring.Annotation.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
//	{First Tarika}
	@Autowired  
	@Qualifier("address1")
private Address address;

public Address getAddress() {
	return address;
}
  //@Autowired   {Second way}
public void setAddress(Address address) {
	this.address = address;
}


public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

//@Autowired {Third Way}
public Emp(Address address) {
	super();
	this.address = address;
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}


}
