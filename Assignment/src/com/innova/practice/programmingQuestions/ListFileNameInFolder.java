package com.innova.practice.programmingQuestions;

import java.io.File;
//  e. Write a program to show list of all file names in a folder.

public class ListFileNameInFolder {

	public static void main(String[] args) {
		File file = new File("C:/Users/arpitadeepak/Downloads/junit/");
		String listOfFile[] = file.list();
		for(String list:listOfFile){
			System.out.println(list);
		}
	}

}
