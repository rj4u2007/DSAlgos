package com.practice.Recursion;

public class MyPermut {

	public static void main(String[] args) {
		
		String input = "abc";
		permut("",input);
		
	}
	public static void permut(String output, String input) {
		
		if(input.length() == 0) {
			System.out.println(output);
			return;
		}
		if(input.length() == 1) {
			System.out.println(output + input);
			return;
		} else {
			String left = input.substring(0,1);
			String right = input.substring(1);
			//output = left + permut(left input);
//			permut(left, right);
//			permut(right, left);
			return;
		}
	}

}
