package com.innova.practice.programmingQuestions;
/*a. Write a program creating an abstract class Shape with properties (noOfSides,area,perimeter) 
  and methods(calculateArea,calculatePerimeter,setSides.*/
public abstract class Shape {
	int noOfSides;
	double area;
	double perimeter;
	public abstract void calculateArea();
		
	public abstract void calculatePerimeter();
	
	public void setSides(){
		System.out.println("It has sides:"+noOfSides);
	}
	
	}


