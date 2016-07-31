package com.innova.practice.programmingQuestions;

import java.util.ArrayList;
//c. Write a program which takes an input series as a1,a2,a3....an,b1,b2,b3...bn and produces output as a1,b1,a2,b2,a3,b3.......,an,bn.
public class PrintingA1B1 {
	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("a1");
		al1.add("a2");
		al1.add("a3");
		al1.add("a4");
		al1.add("a5");
		al1.add("an");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("b1");
		al2.add("b2");
		al2.add("a3");
		al2.add("b4");
		al2.add("b5");
		al2.add("bn");
		
		StringBuffer sbuf = new StringBuffer();
		for(int i=0;i<al1.size();i++){
			sbuf.append(al1.get(i)+","+al2.get(i)+",");
	    }
		System.out.println(sbuf);
	}
}
