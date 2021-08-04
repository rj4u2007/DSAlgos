package com.practice.hackerrank.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoSetsProblem {

	//https://www.hackerrank.com/challenges/between-two-sets/problem
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		a.add(2);
		a.add(3);
		a.add(6);
		b.add(42);
		b.add(84);
		//b.add(12);
		System.out.println(getTotalX(a,b));

	}
	
	
	public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        Collections.sort(a);
        Collections.sort(b);
        int totalFactors = 0;
        int prod = 1;
        
        for(int x : a) {
            prod = prod * x;
        }
        int lcm = prod / gcd(a);
        if(a.size()==1) {
        	lcm = a.get(0);
        }
        //System.out.println(gcd(a));
        int mf = 1;
        while((lcm * mf) <= b.get(0)) {
            boolean itBroke = false;  
            for(int y : b) {
             if((y%(lcm*mf)) != 0) {
                 itBroke = true;
                 break;
              }
            }
            if(itBroke == false) {
                  totalFactors++;
            }
            mf++;  
        }
        return totalFactors;
    }
    
    public static int gcd(List<Integer> nums) {
        int gcd = 1;
        if(nums.size() == 1) {
        	return nums.get(0);
        }
       for(int i=1; i<=nums.get(0); i++) {
           boolean divisor = true;
           for(int x : nums) {
               if(x%i != 0) {
                   divisor = false;
                   break; 
               }
           }
           if(divisor== true) {
               gcd = i;
           }
       }
       return gcd; 
    }

}
