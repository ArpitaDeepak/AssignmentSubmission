package com.innova.practice.programmingQuestions;
/*b. Write a program containing a function which is expected to throw any kind of exception say NullPointerException 
or ArithmeticException etc and then handle this function in the parent function which calls this function.*/
public class ArithmeticExceptionEx {
    public static void divide(int num1,int num2)throws ArithmeticException{
    	int divide = num1/num2;
    	//System.out.println(divide);
    }
	public static void main(String[] args)throws ArithmeticException {
		ArithmeticExceptionEx.divide(5, 0);

	}

}
