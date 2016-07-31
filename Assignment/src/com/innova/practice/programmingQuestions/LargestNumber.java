package com.innova.practice.programmingQuestions;

public class LargestNumber {
	//a. Write a program to find the largest number in a given array.
	public void checkLargestNum(int arr[]){
		int x =arr[0];
		for(int i=0;i<arr.length;i++){
			if(x<arr[i]){
				x= arr[i];
			}
		}
		System.out.println(x);
	}
	
	

	public static void main(String[] args) {
		LargestNumber ln = new LargestNumber();
		int arr[]={10,90,50,89,99,1};
		ln.checkLargestNum(arr);
		
       
	}

}
