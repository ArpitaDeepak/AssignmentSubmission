package com.innova.practice.programmingQuestions;

public class SwapNumber {
	// swap the numbers without any third new variable

	public static void withoutVariable() {
		int x = 20;
		int y = 10;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(x);
		System.out.println(y);

	}

	public static void withVariable() {
		int m = 100;
		int n = 50;
		int p = 0;
		p = m;
		m = n;
		n = p;
		System.out.println(m);
		System.out.println(n);

	}

	public static void main(String[] args) {

		SwapNumber.withoutVariable();
		SwapNumber.withVariable();

	}

}
