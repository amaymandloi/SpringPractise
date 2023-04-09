package com.cons.ref;

public class Perso {
private String name;
private int id;
private Certi certi;
public Perso(String name, int id, Certi certi) {
	this.name = name;
	this.id = id;
	this.certi =certi;
}
@Override
public String toString() {
	return this.name+" : "+this.id+"{ "+this.certi.name+"}";
}

}
