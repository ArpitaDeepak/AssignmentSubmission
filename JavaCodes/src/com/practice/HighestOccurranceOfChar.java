package com.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//4.Find highest occurred character in a String
public class HighestOccurranceOfChar {
	public static void findDuplicateChar(String str) {
		if (str.isEmpty()) {
			System.out.println("String is empty");
		}
		char[] dupChar = str.toCharArray();
		
		Map<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (Character c : dupChar) {
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);

			} else {
				hmap.put(c, 1);
			}
		}
		Collection<Integer> val = hmap.values();
		Iterator<Integer> itr = val.iterator();
		int high_value = 0;
		while (itr.hasNext()) {
			high_value = highestValue(high_value, itr.next().intValue());
		}
	
		
	    Iterator it = hmap.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        
	        if (high_value == ((Integer)pair.getValue()).intValue()) {
		        System.out.println(pair.getKey() + " = " + pair.getValue());
	        }
	        
	    }		
	}

	public static int highestValue(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static void main(String[] args) {
		HighestOccurranceOfChar.findDuplicateChar("hiiiihelllooooooo");
	}

}
