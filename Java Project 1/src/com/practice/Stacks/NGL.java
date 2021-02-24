package com.practice.Stacks;

import java.util.Stack;

//Get the nearest greater to left
//OR
//Nearest largest element
public class NGL {

	public static void main(String[] args) {
		//int[] input = new int[] {1,3,2,4};
		int[] input = new int[] { 100, 80, 60, 70, 60, 75, 85};
		int[] op = nearestGreaterToLeft(input);
		for(int num :op)
			System.out.println(num);

	}
	
	private static int[] nearestGreaterToLeft(int[] input) {
		int[] output = new int[input.length];
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0; i<=input.length-1; i++) {
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
