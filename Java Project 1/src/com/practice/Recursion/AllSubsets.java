package com.practice.Recursion;

import java.util.ArrayList;

public class AllSubsets {

	public static void main(String[] args) {
		
		String input = "abc";
		String output ="";
		allSubsets(output, input);
	}
	
	static ArrayList<String> output = new ArrayList<String>();
	
	public static void allSubsets(String output, String input) {
		
		// Base condition for recursion
		if(input.length() == 0 ) {
			System.out.println(output);
		} else {
			/*
			 *  Essentially we pick the first character of the input and we get two choices.
			 *  First choice is to exclude the character
			 *  Second choice is to include the character
			 *  Once choice is made, output is modified
			 *
			 */
			String op1 = output;
			String newInput = (input.length()>1) ? input.substring(1) : "";
			String op2 = output + input.charAt(0);
			
			// Exclude
			allSubsets(op1, newInput);
			// Include
			allSubsets(op2, newInput);
			return;	
		}		
	}

}
