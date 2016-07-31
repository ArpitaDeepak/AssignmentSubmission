package com.innova.practice.programmingQuestions;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class DuplicateUsingSet {
	/*b. Write a program to find duplicates in an array using set.*/
public static void main(String arg[]){
	/*
String [] names={"joy","john","sam","tom","john"};
Set<String> set = new HashSet<String>();

for(String nonDupName:names){
	if(set.add(nonDupName)==false){
		System.out.println(nonDupName);
	}
}*/
	//2nd method:
	ArrayList<String> list = new ArrayList<String>();
	list.add("a");
	list.add("b");
	list.add("a");
	list.add("c");
	list.add("c");
	LinkedHashSet <String> ls = new LinkedHashSet<String>();//can use hashset but it will not maintain insertion order
	ls.addAll(list);
	ArrayList<String> list2 = new ArrayList<String>();
	list2.addAll(ls);
	for(String withoutDup:list2){
		System.out.println(withoutDup);
	}
	
}}
