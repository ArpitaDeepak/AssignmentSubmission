package com.innova.referenceForPrograms;
  //d. Write a program that implements various functions of different type of access modifiers(private,protected,default,public) and then access these methods with in or outside the class based on the identifier scope.

public class MathUtil {

	public double area(double radius) {
		return Math.PI * radius * radius;
	}
	public double circumference(double radius) {
		return 2*Math.PI * radius;
	}
	private double cube(double radius) {
		return 2*Math.PI * radius;
	}
}
