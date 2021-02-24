package com.practice.Knapsack;

/*
 * O/1 Knapsack Problem using recursion
 * 
 * @author rjha
 * 
 */
public class KnapsackRecursion {

	public static void main(String[] args) {
		// Inputs
		int wt[] = {10, 20, 30};
		int val[] = {60, 100,120};
		int W = 50;
		int n = wt.length;
		
		System.out.println(knapsack(wt, val, W, n));

	}
	
	public static int knapsack(int[] wt, int[] val, int W, int n) {
		
		// Base case
		if(n == 0 || W == 0) {
			return 0;
		} 
		
		// Choice Diagram
		if(wt[n-1] <= W) {
			// Either select or reject
			return Math.max(val[n-1] + knapsack(wt, val, W-wt[n-1], n-1), knapsack(wt,val, W,n-1));
		} else {
			// Reject
			return knapsack(wt, val, W, n-1);
		}
	}

}
