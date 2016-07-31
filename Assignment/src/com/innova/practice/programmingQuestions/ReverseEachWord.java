package com.innova.practice.programmingQuestions;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) { 
		String original ;
		String reverse =" ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text:");
		original = sc.nextLine();
		String [] words =original.split(" ");
		String reverseWord="";
		for(int i=0;i<words.length;i++){
			String word = words[i];
			for(int j=word.length()-1;j>=0;j--){
				reverseWord  = reverseWord + word.charAt(j);
			}
			reverse =reverse + reverseWord +" ";
		}
		System.out.println(reverse);

	}}