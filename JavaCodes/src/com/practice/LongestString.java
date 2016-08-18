package com.practice;
//Find second lengthiest string in a string array

public class LongestString {
    public static Integer lengthiest(String arr[]){
    	Integer maximum = 0;
    	for(int i =0;i<arr.length;i++){
    		if(arr[i].length()> maximum){
    			maximum=arr[i].length();
    			
    		}
    	}
    	return maximum;
    }
	public static void main(String[] args) {
		String array[] ={"aab","abcd","aaaaa","a"};
		System.out.println(LongestString.lengthiest(array));
	}

}
