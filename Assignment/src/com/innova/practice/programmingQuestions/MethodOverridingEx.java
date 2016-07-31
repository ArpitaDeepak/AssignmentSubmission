package com.innova.practice.programmingQuestions;

public class MethodOverridingEx extends OverloadingAndOverriding{
	public void methodOverriding(){
		System.out.println("method overriding of subclass");
	}
	public static void main(String[] args) {
		OverloadingAndOverriding superClassObj = new OverloadingAndOverriding();
		superClassObj.methodOverriding();
		MethodOverridingEx subClassObj = new MethodOverridingEx();
		subClassObj.methodOverriding();
		}
}
