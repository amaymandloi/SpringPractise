package com.standalone.map.collections;
import java.util.*;
public class Person {
private Map<String, Integer> feestructure;

public Map<String, Integer> getFeestructure() {
	return feestructure;
}

public void setFeestructure(Map<String, Integer> feestructure) {
	this.feestructure = feestructure;
}


public Person(Map<String, Integer> feestructure) {
	super();
	this.feestructure = feestructure;
}

@Override
public String toString() {
	return "Person [feestructure=" + feestructure + "]";
}

}





