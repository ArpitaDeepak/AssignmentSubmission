package com.innova.practice.programmingQuestions;

// Write a program to depict the behavior of method overloading and overriding.

public class OverloadingAndOverriding {
	public void methodOverloading() {
		System.out.println("method overloading 1");
	}

	public void methodOverloading(int i) {
		System.out.println("method overloading 2");
	}

	public int methodOverloading(int i, int k) {

		System.out.println("method overloading 3");
		return i + k;
	}
	public void methodOverloading(int i, double j) {
		System.out.println("method overloading 4");
	}

	public void methodOverriding() {
		System.out.println("method overriding of superclass");
	}

	public static void main(String[] args) {
		OverloadingAndOverriding over = new OverloadingAndOverriding();
		over.methodOverloading();
		over.methodOverloading(1, 3);
	}

}
