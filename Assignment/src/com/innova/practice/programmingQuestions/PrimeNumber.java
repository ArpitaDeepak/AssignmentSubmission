package com.innova.practice.programmingQuestions;

public class PrimeNumber {

	public boolean checkPrimeNumber(int num){
		
		for(int i =2;i<=num/2;i++){
			if (num % i==0){
				System.out.println("not prime number");
				return false;
			}
				}
		return true;
		}
				
	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		System.out.println(pn.checkPrimeNumber(1));
	}
}

