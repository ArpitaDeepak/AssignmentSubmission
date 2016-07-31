package com.innova.practice.programmingQuestions;

public class MissingNumberInSortedArray {
	// b. Write a program to find the missing number in a series of sorted
	// numbers stored in an array.
	public static void missingNumber(int arr[]) {
		int lastIndex = arr.length - 1;
		int lastItem = arr[lastIndex];
		int firstItem = arr[0];
		for (int j=firstItem; j<=lastItem; j++) {
			System.out.println(j + " "
					+ MissingNumberInSortedArray.checkIfAvailable(j, arr));
		}
	}
	// method(int i, array)
	// array loop
	// If number i is in loop - return true, else false
	public static boolean checkIfAvailable(int i, int arr[]) {
		for (int k = 0; k < arr.length; k++) {
			if (i == arr[k]) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = { 3, 5, 10 };
		MissingNumberInSortedArray.missingNumber(arr);

	}
}
