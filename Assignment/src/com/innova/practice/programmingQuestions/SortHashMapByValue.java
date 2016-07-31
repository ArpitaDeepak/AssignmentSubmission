package com.innova.practice.programmingQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//	e. Write a program to sort a map by value
public class SortHashMapByValue {
public static void main(String arg[]){
	Map<Integer, String> hmap = new HashMap<Integer, String>();
	hmap.put(11, "java");
	hmap.put(12, "c++");
	hmap.put(15, "perl");
	hmap.put(13, "ruby");
	hmap.put(14, ".net");
	Set<Entry<Integer, String>> set = hmap.entrySet();
    List<Entry<Integer,String>> list = new ArrayList<Entry<Integer,String>>(set);
    Collections.sort( list, new Comparator<Map.Entry<Integer,String>>()
    {
        public int compare( Map.Entry< Integer,String> o1, Map.Entry<Integer,String> o2 )
        {
            return (o2.getValue()).compareTo( o1.getValue() );
        }
    } );
    for(Entry<Integer, String> entry:list){
        System.out.println(entry.getKey()+" -- "+entry.getValue());
    }
}

}
