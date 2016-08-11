package com.ip.programs;
/* 3. Reverse only words in a string.
 *  input: java is easy.
 output: avaj si ysae.*/
public class ReverseOnlyWordSecond {
	public static String reverseString(String toReverse) {
		if (toReverse == null || toReverse.length() <= 1) {
			return toReverse;
		}
		return reverseString(toReverse.substring(1))+toReverse.charAt(0);
		}
	public static void main(String[] args) {
		//String toPass ="java is easy";
		//String arr[]= toPass.split(" ");
		System.out.println(ReverseOnlyWordSecond.reverseString(" java"));
	}

}
