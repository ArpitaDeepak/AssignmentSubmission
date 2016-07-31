package com.innova.practice.programmingQuestions;
/*d. Write a program to perform a linear search on any given array.
Linear search is the basic search where you look for the element to be searched in a sequential way.*/
public class LinearSearch {
	public static void linearSearchOfAnElement(){
		int givenArray[] ={10,20,40,70,30};
		int findElement =70;
		for(int i=0;i<givenArray.length;i++){
			if(findElement==(givenArray[i])){
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		LinearSearch.linearSearchOfAnElement();

	}

}
