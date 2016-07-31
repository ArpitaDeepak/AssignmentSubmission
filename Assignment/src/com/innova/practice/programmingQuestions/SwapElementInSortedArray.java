package com.innova.practice.programmingQuestions;

/*f. Write a program to locate and swap only 2 elements which are not sorted in a given sorted array.
For example given an array {1,2,5,6,4} locate 5 and 4 and then swap them as they are not as per sorted order.*/

public class SwapElementInSortedArray {
    public static void swapElement(){
    	int arr[] = {1,2,5,6,4};
    	for(int i=0;i<arr.length;i++){
    		int j=i+1;
    		if(arr[i]>arr[j]){
    			int k;
    			k=arr[i];
    			arr[i]=arr[j];
    			arr[j]=k;
       		}
       	}
    	for(int m:arr){
    		System.out.println(m);	
       	}
    }
    
	public static void main(String[] args) {
		SwapElementInSortedArray.swapElement();
		int arr[] = {1,2,5,6,4};
        //SwapElementInSortedArray.isSorted(arr);
	}
    public static boolean isSorted(int firstNumber,int secondNumber){
	  
		if(firstNumber<secondNumber){
			int temp = secondNumber;
			return false;
		}
		return true;
	}
}
