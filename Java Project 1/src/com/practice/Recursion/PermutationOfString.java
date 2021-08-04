package com.practice.Recursion;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationOfString {

	public static int count = 0;
	public static void main(String[] args) {
		String input = "ABC";
		Set<String> ls  = new HashSet<String>();
		//permut("", input, ls);
		permut4July("", input, ls);
		
		// Print all the permutations
		for(String str : ls) {
			System.out.println(str);
		}
		System.out.println("Permutation count is : "+count);
	}
	
	public static void permut(String output, String input, Set<String> ls) {
		if(input.length() == 0) {
			ls.add(output);
			return;
		}
		int len = input.length();
		for(int i = 0; i < len; i++) {
			String op = output + input.charAt(i);
			String newInput = null; 
			if(i == 0) {
				newInput = input.substring(1);
			} else {
				newInput = input.substring(0, i) + input.substring(i+1, len);
			}
			permut(op, newInput, ls);
		}
	}
	
	public static void permut4July(String op, String input, Set<String> ls) {
		if(input.length() == 0) {
			ls.add(op);
			count++;
			return;
		}
		// Select one character at a time and add it to the op
		for(int i=0; i<input.length(); i++) {
			String newOp = op + input.charAt(i);
			String newIp = null;
			if(i==0) {
				newIp = input.substring(1);
			} else {
				newIp = input.substring(0,i) + input.substring(i+1);
			}
			permut4July(newOp, newIp, ls);
		}	
	}
}
