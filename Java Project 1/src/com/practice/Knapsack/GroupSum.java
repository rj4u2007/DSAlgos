package com.practice.Knapsack;

public class GroupSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,4,8};
System.out.println(groupSum(0, nums, 10));
	}
	
	public static boolean groupSum(int start, int[] nums, int target) {
		  
		boolean[][] dp = new boolean[nums.length+1][target+1];

		// Initialize
		for(int i=0; i<nums.length+1; i++) {
		  for (int j =0; j<target+1; j++) {
		    if(i==0) {
		      dp[i][j] = false;
		    }    
		    if(j==0) {
		      dp[i][j] = true;
		    }
		  }
		}
		for(int i=1; i<nums.length+1; i++) {
		  for (int j =1; j<target+1; j++) {
		    if(nums[i-1] <= j)
		    dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j] ;    
		    else
		    dp[i][j] = dp[i-1][j];
		  }
		}
		return dp[nums.length][target];

		}


}
