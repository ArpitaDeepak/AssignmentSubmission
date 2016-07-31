package com.innova.practice.programmingQuestions;
import java.util.ArrayList;

public class ArrayListToArray {
	//g. Write a program to copy arraylist to an array.
	public static void main(String args[]){

	ArrayList<String> list = new ArrayList<String>();
	list.add("john");
	list.add("sam");
	list.add("johny");
	list.add("joy");
	list.add("steven");
	
	System.out.println("actual arraylist" + list);
	String str[] = new String[list.size()];
	list.toArray(str);
	System.out.println("created array");
	for(String s:str){
		System.out.println(s);
	}
	
	
	
	
	}
}

