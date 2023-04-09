package com.standalone.collections;
import java.util.*;
public class Person {
private List<String> friends;
private Properties props;
private Map<String, Integer> fee;

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}


public Properties getProps() {
	return props;
}

public void setProps(Properties props) {
	this.props = props;
}



@Override
public String toString() {
	return "Person [friends=" + friends + "]";
}

}