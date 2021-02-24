package com.practice.Stacks;

import java.util.Stack;

// Consecutive smaller or equal shares before current day
// Including current day
/*
 * E.g. I/p : 100, 80, 60, 70, 60, 75, 85
 *      O/p :  1 , 1 , 1 , 2 , 1 , 4 , 6
 *            100, 100, 80,80, 70, 80, 100 
 */
public class StockSpan {
	
	static class Pair {
		int value;
		int index;
		public Pair(int value, int index) {
			this.value=value;
			this.index=index;
		}
	}

	public static void main(String[] args) {
		//int[] input = new int[] { 100, 80, 60, 70, 60, 75, 85};
		int[] input = new int[]  {10, 4, 5, 90, 120, 80};
		int[] output = new int[input.length];
		output = stockSpan(input);
		for(int num : output) 
			System.out.print(num + " ");
	}
	
	private static int[] stockSpan(int[] input) {
		int[] output = new int[input.length];
		Stack<Pair> stack = new Stack<Pair>();
		for(int i=0; i<input.length; i++) {
			if(stack.size() == 0) {
				output[i] = -1;
			} else {
				//int count = 1;
				while(stack.size() > 0 && stack.peek().value <= input[i]) {
					//count++;
					stack.pop();
				}
				if(stack.size() == 0 ) {
					output[i] = -1;
				} else if (stack.peek().value > input[i]) {
					output[i] = stack.peek().index;
				}
			}
			Pair p = new Pair(input[i],i);
			stack.push(p);
		}
		
		for(int i=0; i<input.length;i++) {
			output[i] = i-output[i];
		}
		
		return output;
	}
}
