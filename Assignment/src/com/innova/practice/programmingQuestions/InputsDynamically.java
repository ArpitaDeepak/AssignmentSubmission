package com.innova.practice.programmingQuestions;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*a. Write a program that takes input from user dynamically using below classes.
  			--> Scanner: Use this class to input 2 integer numbers and sum them.
  			--> BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.
  			--> DatainputStream: Use this class to input 2 integer numbers and multiply them.
  			--> Console: Use this class to input 2 integer numbers and divide them.*/
public class InputsDynamically {

	public void usingScanner(){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first integer");
	int i = sc.nextInt();
	System.out.println("enter second integer");
	int j = sc.nextInt();
	int sum = i+j;
	System.out.println("sum is"+sum);
}
	public void usingBufferedReader() throws IOException{
		InputStreamReader stream = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(stream);  
		System.out.println("enter first integer");
		int num1 = Integer.parseInt(br.readLine());
		System.out.println("enter second integer");
		int num2 = Integer.parseInt(br.readLine());
		int subtract=num1-num2;
		System.out.println("subtraction of integers is"+subtract);
        	}
	public void usingDataInputStream() throws IOException{
		DataInputStream data = new DataInputStream(System.in);
		System.out.println("enter first integer");
		int num1 =data.read();
		System.out.println("enter second integer");
		int num2 =data.read();
		int multiply=num1*num2;
		System.out.println("multiplication of integers is"+multiply);
	}
	
	public void usingConsole(){
		Console c =System.console();
		System.out.println("enter first integer");
		int num1 = Integer.parseInt(c.readLine());
		System.out.println("enter second integer");
		int num2 = Integer.parseInt(c.readLine());
		float divide =num1/num2;
		System.out.println(divide);
		
	}
	public static void main(String[] args) throws IOException {
		InputsDynamically input = new InputsDynamically();
		input.usingScanner();
		//input.usingBufferedReader();
		//input.usingConsole();
		//input.usingDataInputStream();
	}
}
