package com.innova.practice.programmingQuestions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionEx {
	/*a. Write a program having different methods to perform below operations.
  			--> To create an arraylist and add elements to it.
  			--> To search for an element in the list.
  			--> To print the elements of the list using iterator.
  			--> To print the elements in the reverse order using ListIterato*/

	public void createList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(list.contains("C"));
		System.out.println(list.contains("k"));
		System.out.println("The index of E is " + list.indexOf("E"));

		ListIterator<String> ltr = list.listIterator();
		System.out.println("traverse elements in  forward direction");

		while (ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		System.out.println("traverse elements in  reverse direction");
		while (ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
	}

	public static void main(String args[]) {
		CollectionEx collect = new CollectionEx();
		collect.createList();
	}
}
