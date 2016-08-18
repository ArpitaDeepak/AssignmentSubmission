package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceOfCharacter {
	public String findDuplicateChar(String str) {
		if (str.isEmpty()){
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
		Set<Entry<Character, Integer>> setEntry = hmap.entrySet();
		for (Entry<Character, Integer> entry : setEntry) {

			System.out.println(entry);
		}
		return str;
	}

	public static void main(String[] args) {
		OccuranceOfCharacter oc = new OccuranceOfCharacter();
		oc.findDuplicateChar("hiiiihelllooooooo");
	}
}
