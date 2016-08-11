package com.ip.programs;

//By using recursion:
public class ReverseStringByFirstMethod {

	public static String reverseString(String toReverse) {
		if (toReverse == null || toReverse.length() <= 1) {
			return toReverse;
		}
		return reverseString(toReverse.substring(1)) + toReverse.charAt(0);
	}
	public static void main(String args[]) {
		System.out.println(ReverseStringByFirstMethod
				.reverseString("java is programming language"));
	}
}
