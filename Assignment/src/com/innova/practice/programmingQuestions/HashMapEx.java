package com.innova.practice.programmingQuestions;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapEx {
    /*d. Write a program having below methods.
  			--> To create a hashmap.
  			--> To search for a key in the created map and then returns its value.*/
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "john");
		hm.put(101, "steve");
		hm.put(102, "joe");
		hm.put(103, "joy");
		System.out.println(hm.get(103));
		System.out.println(hm.entrySet());
		System.out.println(hm.values());
		//printing hashMap 
		Set<Entry<Integer, String>> entry =hm.entrySet();
		for(Entry<Integer, String> en:entry){
			System.out.println(en.getKey()+","+en.getValue());
		}
	}

}
