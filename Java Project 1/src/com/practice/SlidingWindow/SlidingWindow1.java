package com.practice.SlidingWindow;

// Maximum Sum Subarray of size K | Sliding Window
public class SlidingWindow1 {

	public static void main(String[] args) {
		int[] input = new int[] {2,5,1,8,2,9,1};
		int windowSize = 2;
		System.out.println(solveMaxSum(input, windowSize));

	}
	
	private static int solveMaxSum(int[] input, int windowSize) { 
		int maxSum = Integer.MIN_VALUE;
		int temp = 0;
		for(int i=0; i < input.length-windowSize; i++) { 
			if(i==0) {
				int count = 0;
				while(count < windowSize) {
					temp = temp + input[i+count];
					count++;
				}
			} else {
				temp = temp + input[i+windowSize-1] - input[i-1];
			}
			maxSum = Math.max(maxSum, temp);
		}
		return maxSum;
	}
	
	// Brute force Mechanism
	private static int solveMaxSum1(int[] input, int windowSize) {
		int maxSum = Integer.MIN_VALUE;
		for(int i=0; i < input.length-windowSize; i++) {
			int count = 0;
			int temp = 0;
			while(count < windowSize) {
				temp = temp + input[i+count];
				count++;
			}
			maxSum = Math.max(maxSum, temp);
		}
		return maxSum;
	}

}
