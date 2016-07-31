package com.innova.practice.programmingQuestions;

public class AcceptString {
//c. Write a program which accepts a string like "This is nice" and converts it to a string like "This1 is2 nice3".
	public static void stringPattern(){
		String original = "This is nice";
		String words[] = original.split(" ");
		String word =" ";
		for (int i = 0; i < words.length; i++) {
			word= word+((words[i])+(i+1))+" ";
		}
		System.out.println(word);
	}
	public static void main(String[] args) {
		AcceptString.stringPattern();
	}

}
