package com.practice.Stacks;

import java.util.Stack;

public class NSL {

	public static void main(String[] args) {
		int[] input = new int[] {4,5,2,10,8};
		int[] op = nearestSmallestToLeft(input);
		for(int num :op)
			System.out.println(num);
	}
	
	private static int[] nearestSmallestToLeft(int[] input) {
		int[] output = new int[input.length];
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0; i<=input.length-1; i++) {
			if(stack.size() == 0) {
				output[i] = -1;
			} else {
				while(stack.size() >0 && stack.peek() >= input[i]) {
					stack.pop();
				}
				if(stack.size() == 0) {
					output[i] = -1;
				} else if(stack.peek() < input[i]) {
					output[i] = stack.peek();
				}
			}	
			stack.push(input[i]);
		}
	return output;
	}


}
