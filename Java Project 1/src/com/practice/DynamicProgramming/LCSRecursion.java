package com.practice.DynamicProgramming;

/* 
 * LONGEST COMMON SUBSEQUENCE
 */
public class LCSRecursion {

	public static void main(String[] args) {
		String input1 = "abcdef";
		String input2 = "adsbef";
		System.out.println(lcs(input1,input2,input1.length(),input2.length()));
	}
	
	public static int lcs(String a, String b, int n, int m) {
		// Base condition
		if(n == 0 || m == 0) {
			return 0;
		}
		// CHOICE DIAGRAM
		if(a.charAt(n-1) == b.charAt(m-1)) {
			return 1 + lcs(a,b,n-1, m-1);
		} else {
			// Longest is asked, so we choose the max from two choices
			// Choices are, evict one from end of a OR evict one from end of b
			return Math.max(lcs(a,b,n-1,m), lcs(a,b,n,m-1));
		}
	}

}
