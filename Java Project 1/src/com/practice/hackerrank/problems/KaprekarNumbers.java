package com.practice.hackerrank.problems;

import java.util.ArrayList;
import java.util.List;

public class KaprekarNumbers {

	public static void main(String[] args) {
		kaprekarNumbers(1,99999);
	}
	
	public static void kaprekarNumbers(int p, int q) {
	    List<Integer> output = new ArrayList<Integer>();
	    for(int i=p; i<=q; i++) {
	        if(isKaprekarNumber(i)) {
	            output.add(i);
	        }
	    }
	        if(output.size() != 0) {
	            for(int num : output) {
	                System.out.print(num + " ");
	            }
	        } else {
	            System.out.print("INVALID RANGE");
	        }
	    }
	    
	    public static boolean isKaprekarNumber(int n) {
	        int temp = n;
	        long squared = new Long(n)*new Long(n);
	        int numDigits = 1;
	        while(temp > 9) {
	            if(temp/10 > 0) {
	                temp= temp/10;
	                numDigits++;
	            }
	        }
	        long r = squared % (long)Math.pow(10, numDigits);
	        long l = (squared - r) / (long)Math.pow(10, numDigits);
	        
	        if(l + r == n) {
	            return true;
	        } else {
	            return false;
	        }
	    }
}
