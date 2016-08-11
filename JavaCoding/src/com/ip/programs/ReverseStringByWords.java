package com.ip.programs;

/*2. Reverse string by words
	input : java is easy.
	output: easy is java.*/

public class ReverseStringByWords {
        public static String reverseWords(String str){
        String words[] = str.split(" ");
        String reverseWord="";
        for(int i=words.length-1;i>=0;i--){
          String word = words[i];
          reverseWord = reverseWord+word+" ";
         }
        System.out.println(reverseWord);
        return reverseWord;
         
}
	public static void main(String[] args) {
		String str ="java is easy";
		ReverseStringByWords.reverseWords(str);
	}

}
