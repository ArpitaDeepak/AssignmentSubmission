package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

//1.How to sort array of Strings based on their length in Java? 

public class SortArrayByValue {

	public static void sortingArrayBylength(String arr[]) {
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			hmap.put(arr[i], arr[i].length());
		}
		Set<Entry<String, Integer>> set = hmap.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(
				set);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1,
					Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		for (Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		String str[] = { "java", "c++", "perl", "c" };
		SortArrayByValue.sortingArrayBylength(str);
	}

}
