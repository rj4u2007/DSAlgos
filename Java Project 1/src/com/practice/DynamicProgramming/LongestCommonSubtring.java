package com.practice.DynamicProgramming;

public class LongestCommonSubtring {

	public static void main(String[] args) {
		String a = "abcdef";
		//String b = "adsbef";
		String b = "fedcba";
		System.out.println("Output : " + lcs(a,b,a.length(),b.length()));
	}
	
	public static String lcs(String a, String b, int m, int n) {
		// DP variable/Matrix
		int[][] t = new int[m+1][n+1];
		
		for(int i=0; i<m+1;i++) {
			for(int j=0; j<n+1;j++) {
				if(i==0 || j==0) {
					t[i][j] = 0;
				}
			}
		}
		for(int i=1; i<m+1;i++) {
			for(int j=1; j<n+1;j++)  {		
				if(a.charAt(i-1) == b.charAt(j-1)) {
					t[i][j] = 1 + t[i-1][j-1];
				} else {
					t[i][j] = 0;
				}
			}
		}
		
		int i = m;
		int j = n;
		String output = "";
		while(i>0 && j>0) {
			if(a.charAt(i-1) == b.charAt(j-1)) {
				//Character x = new Character(a.charAt(i-1));
				output = output + String.valueOf(a.charAt(i-1));
				i--;
				j--;
			} else {
				if(t[i-1][j] < t[i][j-1]) {
					i--;
				} else {
					j--;
				}
			}
		}
		StringBuilder a1 = new StringBuilder(output);
		a1=a1.reverse();
		return a1.toString();
	}

}
