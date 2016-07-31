package com.innova.practice.programmingQuestions;

public class CommonNumber {
	// Write a program to find the common number in any given two arrays.
	public static void main(String[] args) {
		int x[] = { 1, 2, 5, 8, 10, 7 };
		int y[] = { 3, 5, 9, 10, 9 };
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (x[i] == y[j]) {
					System.out.println(x[i]);
				}
			}
		}

	}

}
