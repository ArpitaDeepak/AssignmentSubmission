package com.innova.practice.programmingQuestions;

public class Square extends Shape{
    double side;
    Square(double side){
    	this.side=side;
    }
	public void calculateArea() {
		area = side*side;
		System.out.println(area);
		
	}
	public void calculatePerimeter() {
        perimeter = 4*side;	
        System.out.println(perimeter);
	}
   public void setSides(){
	   int noOfSides = 4;
	   System.out.println("It has sides:"+noOfSides);
   }
}
