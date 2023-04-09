package com.Stereotype.Annotations;

import java.util.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
@Value("Amaymandloi")
private String studentName;
@Value("DhamNod")
private String studentCity;
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentCity() {
	return studentCity;
}
public void setStudentCity(String studentCity) {
	this.studentCity = studentCity;
}

@Override
public String toString() {
	return "Student [studentName=" + studentName + ", studentCity=" + studentCity + "]";
}

}
