package com.innova.practice.programmingQuestions;

import java.util.Scanner;

// Write a program to check for a palindrome string.
public class PalindromeEx {
	public static void checkPalindrome() {
		String original;
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		original = sc.nextLine();
		for (int i = original.length()- 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if (original.equals(reverse)) {
			System.out.println("string is palindrome");
		} else {
			System.out.println("string is not palindrome");
		}

	}

	public static void main(String[] args) {
		checkPalindrome();
	}

}
