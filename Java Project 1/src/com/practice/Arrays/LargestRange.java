package com.practice.Arrays;

import java.util.HashMap;

public class LargestRange {

	public static void main(String[] args) {
		int[] arr = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
		int[] op = largestRange(arr);
		System.out.println("[" + op[0] + " , " + op[1] + "]");
	}
	
	public static int[] largestRange(int[] array) {
	    HashMap<Integer, String> hm = new HashMap<Integer, String>();
			for(int i = 0; i < array.length; i++) {
				hm.put(array[i], "T");
			}
			
			int[] output = new int[2];
			
			int maxCount = Integer.MIN_VALUE;
			for(int j = 0; j < array.length; j++) {
				int count = 1;
				boolean left = true;
				boolean right = true;
				int temp = array[j];
				int minRange = temp;
				int maxRange = temp;
				if(hm.get(temp).equals("T")) {
					// Find left bound
					while(left) {
						if(hm.containsKey(temp - 1)) {
							hm.put(temp - 1, "F");
							minRange = temp -1 ;
							count++;
						} else {
							left = false;
						}
						temp = temp -1;
					}
					temp = array[j];
					// Find right bound
					while(right) {
						if(hm.containsKey(temp + 1)) {
							hm.put(temp + 1, "F");
							maxRange = temp + 1;
							count++;
						}	else {
							right = false;
						}
						temp = temp + 1;
					}		
				}
				if(count > maxCount) {
					maxCount = count;
					output[0] = minRange;
					output[1] = maxRange;
				}
				
			}
	    return output;
	  }

}
