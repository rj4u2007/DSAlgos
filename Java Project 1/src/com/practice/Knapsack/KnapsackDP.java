package com.practice.Knapsack;

public class KnapsackDP {

	public static void main(String[] args) {
		// Inputs
		int wt[] = {10, 20, 30};
		int val[] = {60, 100,120};
		int W = 50;
		int n = wt.length;
		
		System.out.println(knapsack(val, wt, W, n));
		
	}
	
	public static int knapsack(int[] val, int[] wt, int W, int n) {
		
		// Memoization
		int[][] t = new int[n+1][W+1];
		
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<W+1; j++) {
				
				// Fill the table i.e. initialize
				if(i==0 || j==0) {
					t[i][j] = 0;
				} else {
					// Choice Diagram
					if(wt[i-1] <= j) {
						// Select or Reject
						t[i][j] = Math.max( val[i-1] + t[i-1][j-wt[i-1]], t[i-1][j]);
					} else {
						// Reject
						t[i][j] = t[i-1][j];
					}
				}
			}
		}	     
		
		return t[n][W];
	}
}
