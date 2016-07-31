package com.innova.practice.programmingQuestions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchStringInFile {
//d. Write a program to search for a string in a file and then replace it with another string.
	
	public static void searchAndReplace(String search,String replace) throws IOException{
		try {
			FileReader reads = new FileReader("C:\\Users\\arpitadeepak\\Desktop\\read.txt");
			BufferedReader buff = new BufferedReader(reads);
			 String text= buff.readLine();
			 String words[] = text.split(" ");
			 for( int i=0; i<words.length;i++){
			  if(words[i].equals(search)){
				String newText = text.replaceAll(search,replace);
				System.out.println(newText);
			 }else{
				 System.out.println("text not present");
			 }}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException {
		SearchStringInFile.searchAndReplace("Hello","Good morning");
	}

}
