package com.innova.practice.programmingQuestions;
/*Write a program that contains a constructor, a static block and a static method. 
Execute the program in order to verify the order to execution of methods and block.*/
public class StaticEx {
	String text;
 StaticEx(String text){
	this.text=text;
}
 static{
	 System.out.println("Print 1");
 }
 public static void main(String[] args) {
	StaticEx ex = new StaticEx("print 2");
	System.out.println(ex.hashCode());
}
}
