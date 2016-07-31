package com.innova.practice.programmingQuestions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*c. Write a program to search for a string in a file 
and then return the count of number of occurrences of the string.*/

public class SearchStringAndCountOccurence {
    public void  searchAndCount(String search){
    	FileReader reads;
		try {
			reads = new FileReader("C:\\Users\\arpitadeepak\\Desktop\\read.txt");
			BufferedReader buff = new BufferedReader(reads);
			 String text= buff.readLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
