package com.innova.practice.programmingQuestions;
/*d. Write a program that implements various functions of different type of access modifiers(private,protected,default,public)
and then access these methods with in or outside the class based on the identifier scope.
For public and private:*/

import com.innova.referenceForPrograms.MathUtil;
public class AccessModifierEx {
	public static void main(String args[]) {
		MathUtil util = new MathUtil();
		double areaOfCircle;
		double circumferenceOfCircle;
		areaOfCircle = util.area(5.5);
		circumferenceOfCircle = util.circumference(5.5);
		//util.cube(5.5); cannot access cube method as its private.
        System.out.println(areaOfCircle);
        System.out.println(circumferenceOfCircle);
	}
}