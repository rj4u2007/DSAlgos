package com.practice.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSets {

	
	static ArrayList<List<Integer>> finalOutput = new ArrayList<List<Integer>>();
		
	public static void createPowerSets(List<Integer> output, List<Integer> input) {
		if(input.size() == 0) {
			finalOutput.add(output);
			return;
		} else {
			List<Integer> newInput = createCopy(input);
			newInput.remove(newInput.get(0));
			int x = input.get(0);
			List<Integer> output1  = createCopy(output);
			List<Integer> output2  = createCopy(output);
			output2.add(x);
			// Exclude
				createPowerSets(output1, newInput);
			// Include
				createPowerSets(output2, newInput);
			return;
		}
	}
	
	// Create a deep copy of ArrayList in java
	public static List<Integer> createCopy(List<Integer> ip) {
		List<Integer> op = new ArrayList<Integer>();
		for(int n : ip) {
			op.add(n);
		}
		return op;
	}
	
	public static void main(String[] args) {
		
		List<Integer> input = new ArrayList<Integer>();
		List<Integer> output = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		createPowerSets(output, input);
		
		System.out.println(finalOutput);
		
	}
}
