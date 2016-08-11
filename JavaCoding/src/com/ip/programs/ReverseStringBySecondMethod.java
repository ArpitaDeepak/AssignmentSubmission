package com.ip.programs;

import java.util.Scanner;

public class ReverseStringBySecondMethod {
	public String reverseString() {
		String original;
		String reverse =" ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse:");
		original = sc.nextLine();
		for (int i =original.length()- 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.print("Reverse of entered string is: "+reverse);
		return reverse;
	}
	public static void main(String args[]) {
		ReverseStringBySecondMethod revString = new ReverseStringBySecondMethod();
		revString.reverseString();
	}
}
