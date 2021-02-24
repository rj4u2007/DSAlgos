package com.practice.Recursion;

import java.util.stream.IntStream;

public class JosephCircleProblem {

	public static void main(String[] args) {

		// Inputs n and k
		int n = 40;
		int k = 7;

		int[] input = new int[n];
		// Create input array
		for(int i=0; i< n; i++) {
			input[i] = i+1;
		}

		System.out.println(solve(input, k, 0));

	}
	public static int solve(int[] input, int k, int curr) {
		if(input.length == 1) {
			return input[0];
		} else {

			curr = (curr + k - 1) % input.length;
			input = removeTheElement(input, curr);
			return solve(input, k, curr);
		}
		// This will never be called
		//return -1;
	}

	public static int[] removeTheElement(int[] arr,  
			int index) 
	{ 

		// If the array is empty 
		// or the index is not in array range 
		// return the original array 
		if (arr == null
				|| index < 0
				|| index >= arr.length) { 

			return arr; 
		} 

		// return the resultant array 
		return IntStream.range(0, arr.length) 
				.filter(i -> i != index) 
				.map(i -> arr[i]) 
				.toArray(); 
	} 

}
