package com.innova.practice.programmingQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//  g. Write a program to merge 2 arrays.
public class MergeArray {

	@SuppressWarnings("unchecked")
	public void mergeTwoArray(){
		String a[] = {"one","two","three"};
		String b[] = {"four","five","six"};
		List list = new ArrayList();
		Collections.addAll(list, a);
		Collections.addAll(list, b);
		Object c[] = list.toArray();
		int length = c.length;
		System.out.println(length);
	}
	public void mergeTwoIntegerArray(){
		Integer x[] = {1,2,3,4,5};
		Integer y[] = {6,7,8,9,10};
		List<Integer>list = new ArrayList<Integer>();
		Collections.addAll(list, x);
		Collections.addAll(list, y);
		Object[] j =list.toArray();
		for(Object i :j){
			System.out.println((Integer)i);
		}
		System.out.println(j.length);
	}

	public static void main(String[] args) {
	
		MergeArray mergeArray = new MergeArray();
		//mergeArray.mergeTwoArray();
		mergeArray.mergeTwoIntegerArray();
	}

}
