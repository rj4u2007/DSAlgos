package com.practice.Stacks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinMaxStackO1Time {

	public static void main(String[] args) {
		MinMaxStack stack = new MinMaxStack();
		stack.push(2);
		System.out.println(stack.getMin());
		System.out.println(stack.getMax());
		System.out.println(stack.peek());
		stack.push(7);
		System.out.println(stack.getMin());
		System.out.println(stack.getMax());
		System.out.println(stack.peek());
		stack.push(1);
		System.out.println(stack.getMin());
		System.out.println(stack.getMax());
		System.out.println(stack.peek());
		stack.push(8);
		System.out.println(stack.getMin());
		System.out.println(stack.getMax());
		System.out.println(stack.peek());
		stack.push(3);
		System.out.println(stack.getMin());
		System.out.println(stack.getMax());
		System.out.println(stack.peek());
		stack.push(9);
		System.out.println(stack.getMin());
		System.out.println(stack.getMax());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.getMin());
		System.out.println(stack.getMax());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.getMin());
		System.out.println(stack.getMax());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.getMin());
		System.out.println(stack.getMax());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.getMin());
		System.out.println(stack.getMax());
		System.out.println(stack.peek());
		System.out.println(stack.pop());

	}

	static class MinMaxStack {
		List<HashMap<String, Integer>> minMaxStack = new ArrayList<HashMap<String, Integer>>();
		List<Integer> stack = new ArrayList<Integer>();

		public int peek() {
			if(stack.size() > 0 ) {
				return stack.get(stack.size() - 1);
			}
			return -1;
		}

		public int pop() {
			int temp = stack.get(stack.size() - 1);
			minMaxStack.remove(minMaxStack.size() - 1);
			stack.remove(stack.size() - 1);
			return temp;
		}

		public void push(Integer number) {
			stack.add(number);
			if(minMaxStack.size() > 0) {
				HashMap<String, Integer> currMinMax = minMaxStack.get(minMaxStack.size() - 1);
				HashMap<String, Integer> newMinMax = new HashMap<String, Integer>();
				if(number < currMinMax.get("min")) {
					newMinMax.put("min", number);
					newMinMax.put("max", currMinMax.get("max"));
				} else if(number > currMinMax.get("max")) {
					newMinMax.put("max", number);
					newMinMax.put("min", currMinMax.get("min"));				
				} else {
					newMinMax.put("min", currMinMax.get("min"));
					newMinMax.put("max", currMinMax.get("max"));
				}
				minMaxStack.add(newMinMax);
			} else {
				HashMap<String, Integer> tempMinMax = new HashMap<String, Integer>();
				tempMinMax.put("min", number);
				tempMinMax.put("max", number);
				minMaxStack.add(tempMinMax);
			}
		}

		public int getMin() {
			if(minMaxStack.size() > 0) {
				return minMaxStack.get(minMaxStack.size() - 1).get("min");
			}
			return -1;
		}

		public int getMax() {
			if(minMaxStack.size() > 0) {
				return minMaxStack.get(minMaxStack.size() - 1).get("max");
			}
			return -1;
		}
	}

}
