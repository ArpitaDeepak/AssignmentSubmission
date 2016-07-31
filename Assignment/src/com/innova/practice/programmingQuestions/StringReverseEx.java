package com.innova.practice.programmingQuestions;
import java.util.Scanner;


public class StringReverseEx {
	//a. Write a program to reverse a string.Donot use StringBuffer/StringBuilder inbuilt reverse function.
	public static void main(String[] args) {
		String original;
		String reverse="" ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		original = sc.nextLine();
		for ( int i = original.length()-1; i >=0 ; i-- ){
	         reverse = reverse + original.charAt(i);
	}
     System.out.print("Reverse of entered string is: "+reverse);

}}
