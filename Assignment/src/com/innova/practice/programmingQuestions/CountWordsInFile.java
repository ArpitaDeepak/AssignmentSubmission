package com.innova.practice.programmingQuestions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Write a program to count the number of words in a file.
public class CountWordsInFile {
	public static void noOfWords() throws IOException {
		FileReader file = new FileReader("C:\\Users\\arpitadeepak\\Desktop\\read.txt");
        BufferedReader reader = new BufferedReader(file);
        String read = reader.readLine();
        //System.out.println(read);
       String words[] = read.split(" ");
       System.out.println(words.length);
	}

	public static void main(String[] args) throws IOException {
		CountWordsInFile.noOfWords();
	}
}
