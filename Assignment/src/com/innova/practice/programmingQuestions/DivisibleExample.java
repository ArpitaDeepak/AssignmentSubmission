package com.innova.practice.programmingQuestions;
public class DivisibleExample {

	public void checkIfDivsible(int num) {

		if ((num % 3 == 0) && (num % 5 == 0)) {
			System.out.println("ping pong");
		} else {
			if (num % 3 == 0) {

				System.out.println("ping");
			} else if (num % 5 == 0) {
				System.out.println("pong");
			}
			else{
				System.out.println("none is divisible");
			}
		}
	}

	public static void main(String[] args) {

		DivisibleExample de = new DivisibleExample();
		de.checkIfDivsible(11);
	}

}
