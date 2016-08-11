package com.ip.programs;

import java.util.Arrays;

/*4. To check if a strings are anagarams. Anagrams are the strings which are composed with same letters but in different order.
 for ex race is an anagram of acer. mother in law anagram would be healthi nworm*/

//using sort() and equals()
public class AnagaramOrNot {
	public boolean isAnagaram(String original, String itsAnagaram) {
		char[] charOriginal = original.toCharArray();
		char[] charAnagram = itsAnagaram.toCharArray();
		Arrays.sort(charOriginal);
		Arrays.sort(charAnagram);
		return Arrays.equals(charOriginal, charAnagram);
	}

	public static void main(String[] args) {
		 AnagaramOrNot ang = new AnagaramOrNot();
         System.out.println(ang.isAnagaram("race", "acer"));
         System.out.println(ang.isAnagaram("mother in law", "healthi nworm"));
         
	}

}
