package com.practice.leetcode.problems;

import java.util.HashMap;

public class RabbitsInForest {

	public static void main(String[] args) {
		int[] input = {1,1,2};
		System.out.println(numRabbits(input));

	}
	
	public static int numRabbits(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int num : answers) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }
        
        int minCount = 0;
        for(int key : map.keySet()) {
            int setCount = key+1;
            
            System.out.println();
            int groupCount = (int) Math.ceil(map.get(key) * 1.0 / setCount*1.0);
            minCount = minCount + groupCount*setCount;
        }
        return minCount;
    }

}
