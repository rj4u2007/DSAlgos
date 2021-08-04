package com.practice.DynamicProgramming;

public class LongestCommonPalindromicSubtring {

	public static void main(String[] args) {
		System.out.println(longestPalindromicSubstring("abaxyzzyxf"));

	}

	public static String longestPalindromicSubstring(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String a = str;
		String b = sb.toString();
		int len = str.length();
		return lps(a, b, len, len);
	}

	public static String lps(String a, String b, int m, int n) {
		String output = "";
		// DP Variable	
		int[][] t = new int[m+1][n+1];

		// Fill in the DP Matrix
		for(int i=0; i<m+1;i++) {
			for(int j=0; j<n+1;j++) {
				if(i==0 || j==0) {
					t[i][j] = 0;
				}
			}
		}
		for(int i=1; i<m+1; i++) {
			for(int j=1; j<n+1; j++) {

				if(a.charAt(i-1) == b.charAt(j-1)) {
					t[i][j] = 1 + t[i-1][j-1];
				} else {
					t[i][j] = 0;
				}					

			}
		}
		int maxI = 0;
		int maxJ = 0;
		int maxVal = 0;
		for(int i=0; i<m+1; i++) {
			for(int j=0; j<n+1; j++) {
				if(t[i][j] > maxVal) {
					maxVal = t[i][j];
					maxI = i;
					maxJ = j;
				}
				System.out.print(t[i][j] + " ");
			} 
			System.out.println();
		}
		
		System.out.println("Size of longest substring is : " + t[m][n]);
		System.out.println("Max Value : " + maxVal);
		System.out.println("Max I : " + maxI);
		System.out.println("Max J : " + maxJ);
		
		int i=maxI;
		int j=maxJ;

		while(i>0 && j>0) {
			if(a.charAt(i-1) == b.charAt(j-1)) {
				output = output + String.valueOf(a.charAt(i-1));
				i--;
				j--;
			} else {
				if(t[i][j-1] > t[i-1][j]) {
					i--;
				} else {
					j--;
				}				
			}

		}

		StringBuilder sb = new StringBuilder(output);
		sb.reverse();

		return sb.toString();
	}

}
