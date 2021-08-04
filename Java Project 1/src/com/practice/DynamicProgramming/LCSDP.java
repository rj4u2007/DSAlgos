package com.practice.DynamicProgramming;

public class LCSDP {

	public static void main(String[] args) {
		String a = "abcdef";
		String b = "adsbef";
		System.out.println(lcs(a,b,a.length(),b.length()));
	}
	
	public static int lcs(String a, String b, int m, int n) {
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
					t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
				}
			}
		}
		return t[m][n];

	}
	
	

}
