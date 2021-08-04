package com.practice.Strings;

import java.util.ArrayList;

public class ReverseSentence {

	public static void main(String[] args) {
		String input = "this this words this this this words this";
		System.out.println(reverseWordsInString(input));
	}
	
	 public static String reverseWordsInString(String string) {
		    int strLen = string.length();
				int i=0;
				ArrayList<String> words = new ArrayList<String>();
				String word = "";
				while(i < strLen) {
					if(string.charAt(i) != ' ') {
						word = word + string.charAt(i);
					} else {
						words.add(word);
						word = "";
					}
					i++;
				}
				words.add(word);
				string = "";
				
				for(int j=words.size()-1; j>=0;j--) {
					if(j != 0 ) {
						string = string + words.get(j) + ' ';
					} else {
						string = string + words.get(j) ;
					}
				}
		    return string;
		  }

}
