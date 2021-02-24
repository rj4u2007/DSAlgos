package com.practice.Knapsack;

import java.util.Arrays;

public class KnapsackMemoization {
	
	public static void main(String[] args) {
		// Inputs
		int wt[] = {10, 20, 30};
		int val[] = {60, 100,120};
		int W = 50;
		int n = wt.length;
		
		// Memoization - **** n+1 and W+1
		int[][] t = new int[n+1][W+1];
		for(int i=0; i< t.length; i++) {
			for(int j =0; j< t[0].length; j++) {
				t[i][j] = -1;
			}
		}
		
				
		System.out.println(knapsack(wt, val, W, n, t));

	}
	
	public static int knapsack(int[] wt, int[] val, int W, int n, int[][] t) {
		
		// Base case
		if(n == 0 || W == 0) {
			return 0;
		}
		
		if(t[n][W] !=  -1) {
			return t[n][W]; 
		}
		
		// Choice Diagram
		if(wt[n-1] <= W) {
			// Either select or reject
			return t[n][W] = Math.max(val[n-1] + knapsack(wt, val, W-wt[n-1], n-1, t), knapsack(wt,val, W,n-1,t));
		} else {
			// Reject
			return t[n][W] = knapsack(wt, val, W, n-1,t);
		}
	}

}
