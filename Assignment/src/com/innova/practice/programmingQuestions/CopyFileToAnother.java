package com.innova.practice.programmingQuestions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// f. Write a program to copy content of file into another file.

public class CopyFileToAnother {

	public static void main(String[] args) throws FileNotFoundException {
		File file1 = new File("C:\\Users\\arpitadeepak\\Desktop\\read.txt");
		File file2 = new File("C:\\Users\\arpitadeepak\\Desktop\\Write.txt");
		FileInputStream input = new FileInputStream(file1);
		FileOutputStream output = new FileOutputStream(file2);
		byte [] content = new byte[1024];
		int length;
		try {
			while((length=input.read(content))>0){
				output.write(content, 0, length);
				System.out.println("success");  
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
