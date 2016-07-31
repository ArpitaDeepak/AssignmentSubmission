package com.innova.practice.programmingQuestions;

public class WithoutLoopEx  {
//b. Write a program to print 1 to 10 numbers without using loops and you should not have more than 1 print statement
	public int withoutLoop(int x){

		if(x<=10 && x>=0){
			withoutLoop(x-1);
			System.out.println(x);
			}
		return x;
				}
	public static void main(String[] args) {
		WithoutLoopEx loop = new WithoutLoopEx();
		loop.withoutLoop(10);
			}
}
