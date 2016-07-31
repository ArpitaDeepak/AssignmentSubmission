package com.innova.practice.programmingQuestions;
/*c. Write a program that creates a class Circle extending Shape abstract class and implementing ShapeConstants interface
 *  and has following behavior.
  			--> Properties: radius.
  			--> Constructor: To set number of sides.
  			--> Overrides all the methods from parents.*/
public class Circle extends Shape implements ShapeConstants{
    double radius;
   // final double pi = Math.PI;
    public Circle( double radius){
    	this.radius=radius;
    }
	@Override
	public void calculateArea() {
		area = pi * Math.pow(radius, 2);
		System.out.println(area);
	}

	@Override
	public void calculatePerimeter() {
		perimeter =2*Math.PI*radius;
		System.out.println(perimeter);
	}

}
