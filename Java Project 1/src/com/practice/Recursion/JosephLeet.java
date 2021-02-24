package com.practice.Recursion;

import java.util.ArrayList;
import java.util.List;

public class JosephLeet {

	public static void main(String[] args) {
		System.out.println(lastRemaining(4));

	}

	public static int lastRemaining(int n) {
        int[] input = new int[n];
        for(int i=0; i<n; i++) {
            input[i] = i+1;
        }
        return solve(input, 0);
    }
    
    public static int solve(int[] input, int type) {
        if(input.length == 1) {
            return input[0];
        } else {
            List<Integer> newInput = new ArrayList<Integer>();
            if(type % 2 == 0) {
            	 for(int i=0; i< input.length; i++) { 
            		 if(i%2 != 0) {
                         newInput.add(input[i]);
                     } 
            	 }
            } else {
           	 for(int i=input.length -1 ; i > 0; i--) { 
           		 if (input.length %2 == 0) {
           			if(i%2 == 0) {
                        newInput.add(input[i]);
                    }  
           		 } else {
           			if(i%2 != 0) {
                        newInput.add(input[i]);
                    } 
           		 }
        		 
        	 }
            }
            type++;
            int[] newInputArr = new int[newInput.size()];
            for(int j=0; j<newInput.size();j++) {
                newInputArr[j] = newInput.get(j);
            }
            return solve(newInputArr, type);
        }
    }
}
