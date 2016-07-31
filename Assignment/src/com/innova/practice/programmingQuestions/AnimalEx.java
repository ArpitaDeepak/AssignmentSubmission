package com.innova.practice.programmingQuestions;
/*d. Write a program that implements various functions of different type of access modifiers(private,protected,default,public) 
 * and then access these methods with in or outside the class based on the identifier scope.
for protected and default */

public class AnimalEx {
	protected void makeSounds() {
       System.out.println("sounds");
	}

	void eats() {
		System.out.println("eats");
	}
}
