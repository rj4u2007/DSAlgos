package com.practice.DynamicProgramming;

/*
 * Given a number n, count minimum steps to minimize it to 1 according to the following criteria:
 * 
 * If n is divisible by 2 then we may reduce n to n/2.
 * If n is divisible by 3 then you may reduce n to n/3.
 * Decrement n by 1.
 * 
 */
public class MinStepsTo1 {

	static int count = 0;
	public static void main(String[] args) {
		int input = 10;	
		// Create DP array
		int[] dp = new int[input+1];	
		System.out.println(minStepsDp(input, dp));
	}
	
	public static int minStepsDp(int input, int[] dp) {
		if(input == 1 || input == 0) {
			return 0;
		}
		if(dp[input] > 0) {
			return dp[input];
		}
		int ans = 1 + minStepsDp(input-1, dp);
		if(input % 3 == 0) {
			ans = 1 + Math.min(ans, minStepsDp(input/3, dp));
		}
		if(input % 2 == 0) {
			ans = 1 + Math.min(ans, minStepsDp(input/2, dp));
		}
		dp[input] = ans;
		return ans;
	}
	
	public static int calcMinSteps(int n) {
		if(n==1) {
			return 0;
		}
		if(n % 3 == 0) {
			n= n/3;
			return 1 + calcMinSteps(n);
		} else if (n % 2 == 0) {
			n = n/2;
			return 1 + calcMinSteps(n);
		} else {
			n = n-1;
			return 1 + calcMinSteps(n);
		}
	}
	
	public static int calcMinSteps2(int n) { 
		if(n == 1) {
			return 0;
		}
		int ans = 1 + calcMinSteps2(n-1);
		if(n%3 == 0) {
			ans = 1 + Math.min(calcMinSteps2(n/3), ans);
		}
		if(n%2 == 0) {
			ans =  1 + Math.min(calcMinSteps2(n/2), ans);
		}

		return ans;
	}

}
