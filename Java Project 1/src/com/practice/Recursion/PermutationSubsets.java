package com.practice.Recursion;

import java.util.HashSet;
import java.util.Set;

public class PermutationSubsets {

	public static void main(String[] args) {
		String input = "AB";
		Set<String> ls = new HashSet<String>();
		permutSubsets("", input, ls);
		System.out.println(ls);
	}
	
	public static void permutSubsets(String output, String input, Set<String> ls) {
		int len = input.length();
		
		// Base condition
		if(len == 0) {
			ls.add(output);
			return;
		}
		for(int i=0; i<len; i++) {
			String op = "" + input.charAt(i);
			String newInput = "";
			if(i == 0) {
				newInput = input.substring(1);
			} else {
				newInput = input.substring(0,i) + input.substring(i+1, len);
			}
			// CHOICE 1 - INCLUDE
			permutSubsets(output+op, newInput, ls);
			// CHOICE 2 - EXCLUDE
			permutSubsets(output, newInput, ls);
		}
	}

}
