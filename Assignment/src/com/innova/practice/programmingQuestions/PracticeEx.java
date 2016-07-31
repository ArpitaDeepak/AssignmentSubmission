package com.innova.practice.programmingQuestions;

public class PracticeEx {
	public static boolean isSorted(int firstNumber,int secondNumber){
		  
		if(firstNumber<secondNumber){
		  return true;
		}
		  return false;
	}
	public static int[] swapSortedArray(int almostSorted[]){
		int wronglyPlacedNumber = 0; 
		int wronglyPlaceNumberIndex = 0;
		for(int i=0;i<almostSorted.length;i++){
			if((i==almostSorted.length-1)){
				 wronglyPlacedNumber =almostSorted[i];
				 wronglyPlaceNumberIndex = i;
				break;
			}
			if(!(PracticeEx.isSorted(almostSorted[i], almostSorted[i+1]))){
				 wronglyPlacedNumber =almostSorted[i+1];
				 wronglyPlaceNumberIndex = i+1;
				 break;
			}
		}
		
		int[] sortedArray = new int[almostSorted.length];
		for(int i=0;i<almostSorted.length;i++){
			if(PracticeEx.isSorted(almostSorted[i], wronglyPlacedNumber)){
				sortedArray[i]=almostSorted[i];
			} else {
				sortedArray[i]= wronglyPlacedNumber;
				for (int j = i+1; j <= wronglyPlaceNumberIndex; j++) {
					sortedArray[j] = almostSorted[j-1];
				}
				break;
			}
		}
		return sortedArray;
	}

	public static void main(String[] args) {
		int almostSorted[] = {1,2,5,6,4};
		int sortedArray[] = PracticeEx.swapSortedArray(almostSorted);
		System.out.println(sortedArray.toString());
	}

}
