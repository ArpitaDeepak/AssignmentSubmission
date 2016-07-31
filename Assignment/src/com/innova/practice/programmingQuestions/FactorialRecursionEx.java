package com.innova.practice.programmingQuestions;
public class FactorialRecursionEx {

	public int calculateFactorial(int fac) {

		if (fac > 1) {
			fac = fac * calculateFactorial(fac - 1);
		} else {
			return 1;
		}
		return fac;
	}

	public static void main(String[] args) {
		FactorialRecursionEx fx = new FactorialRecursionEx();
		int val = fx.calculateFactorial(5);
		System.out.println(val);
	}

}
