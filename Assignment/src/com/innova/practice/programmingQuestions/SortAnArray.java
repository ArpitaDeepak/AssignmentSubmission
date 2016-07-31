package com.innova.practice.programmingQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAnArray {
// e. Write a program to sort an array.
	public static void sortArray(){ 
		String []arr ={"apple","mango","pear","pineapple","peach"};
		List<String> list = new ArrayList<String>();
		Collections.addAll(list, arr);
		Collections.sort(list);
		Object[] arr2 = list.toArray();
		System.out.println(arr2.length);
		for(Object o:arr2){
			System.out.println((String)o); 
		}
	}
	public static void main(String[] args) {
		SortAnArray.sortArray();

	}

}
