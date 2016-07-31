package com.innova.practice.programmingQuestions;
import java.util.EnumSet;
import java.util.Iterator;

public class EnumEx2 {
	//Write a program that defines an enum having months of the year and then prints the value of all the enum elements.

	public enum Month {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	}
	public static void main(String[] args) {
		EnumSet<Month> month = EnumSet.allOf(Month.class);
		/*for(Month m: month){
			System.out.println(m);
		}*/
		Iterator<Month> itr = month.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
	}
		
}
