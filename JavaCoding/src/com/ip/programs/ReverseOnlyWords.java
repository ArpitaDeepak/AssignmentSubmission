package com.ip.programs;

/* 3. Reverse only words in a string.
 *  input: java is easy.
 output: avaj si ysae.
 using split()*/
public class ReverseOnlyWords {
	public String reverseWords(String str) {
		String reverseString = "";
		String words[] = str.split(" ");
		String reverseWord = "";
		for (int j = 0; j < words.length; j++) {
			String word = words[j];
			for (int i = word.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + word.charAt(i);
			}
		}
		reverseString = reverseString + reverseWord +" ";
		System.out
				.println("Reverse only words in a string is:" + reverseString);
		return reverseString;
	}

	public static void main(String[] args) {
		ReverseOnlyWords strword = new ReverseOnlyWords();
		strword.reverseWords("java is easy");
	}

}
