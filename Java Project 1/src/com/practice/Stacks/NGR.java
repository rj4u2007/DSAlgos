package com.practice.Stacks;

import java.util.Stack;

// Get the nearest greater to right
//    OR
// Nearest largest element
public class NGR {

	public static void main(String[] args) {
		//int[] input = new int[] {1,3,2,4};
		int[] input = new int[] {11,13,21,3};
		int[] op = nearestGreaterToRight1(input);
		for(int num :op)
		System.out.println(num);
	}

	private static int[] nearestGreaterToRight1(int[] input) {
		int[] output = new int[input.length];
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=input.length-1; i>=0; i--) {
			if(stack.size() == 0) {
				output[i] = -1;
			} else {
				while(stack.size() >0 && stack.peek() <= input[i]) {
					stack.pop();
				}
				if(stack.size() == 0) {
					output[i] = -1;
				} else if(stack.peek() > input[i]) {
					output[i] = stack.peek();
				}
			}	
			stack.push(input[i]);
		}
	return output;
	}
}
