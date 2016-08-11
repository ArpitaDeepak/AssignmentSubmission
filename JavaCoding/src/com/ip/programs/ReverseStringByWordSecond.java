package com.ip.programs;

/*2. Reverse string by words
 input : java is easy.
 output: easy is java.*/
public class ReverseStringByWordSecond {
	public static String reverseWord(String str) {
		String strArray[] = str.split(" ");
		int lengthOfString = strArray.length;

		int numberOfReversal = lengthOfString / 2;

		for (int i = 0; i < numberOfReversal; i++) {

			String temp = strArray[i];

			strArray[i] = strArray[lengthOfString - i - 1];

			strArray[lengthOfString - i - 1] = temp;
		}
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < strArray.length; i++) {

			stringBuilder.append(strArray[i]).append(" ");
			
			
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		 String reverseWord =ReverseStringByWordSecond.reverseWord("java is easy");
		 System.out.println(reverseWord);

	}

}
