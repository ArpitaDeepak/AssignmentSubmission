package com.innova.practice.programmingQuestions;

public class FibnacciSeriesEx {

	public void checkSeries(){
		int f1=0;
		int f2=1;
		int f3=0;
		int count=10;
		System.out.print(f1+" "+f2);
		for(int i=2;i<count;i++){
			f3 = f1+f2;
			System.out.print(f3);
			f1=f2;
			f2=f3;
		}
		
	}
	public static void main(String[] args) {
		FibnacciSeriesEx fib = new FibnacciSeriesEx();
		fib.checkSeries();
	}
}
