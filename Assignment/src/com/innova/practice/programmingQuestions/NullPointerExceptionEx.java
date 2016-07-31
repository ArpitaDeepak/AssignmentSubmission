package com.innova.practice.programmingQuestions;

public class NullPointerExceptionEx {
	// a. Write a program that is expected to throw a null pointer exception and
	// in turn handles it using try catch and finally.
	static String notIntialised = null;
	
	public static void main(String[] args) {
		try {
			System.out.println(notIntialised.toLowerCase());
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			System.out.println("null pointer exception");
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
