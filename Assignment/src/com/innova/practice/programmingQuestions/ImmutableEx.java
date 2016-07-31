package com.innova.practice.programmingQuestions;
	//a. Write an Immutable class.
public final class ImmutableEx {
private final String employeeName;	
private final Integer SSN;

public ImmutableEx(String employeeName,Integer SSN){
	this.SSN = SSN;
	this.employeeName = employeeName;
}
public Integer getSSN(){
	return SSN;
}
public String getEmployeeName(){
	return employeeName;
}
}
