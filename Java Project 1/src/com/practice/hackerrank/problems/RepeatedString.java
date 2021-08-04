package com.practice.hackerrank.problems;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeatedString("aba",10));

	}

	public static long repeatedString(String s, long n) {
	    int length = s.length();
	        
	    if(n <= length) {
	        return count(s, length);
	    }
	    
	    int factor = (new Long(n)).intValue()/length;
	    
	    int left = (new Long(n)).intValue() % length;
	    
	    return factor*count(s, length) + count(s.substring(0,left), left);
	        
	    }
	    
	    public static int count(String s, int length) {
	        int count = 0;
	        for(int i=0; i<length;i++) {
	            if(s.charAt(i)=='a') {
	             count++;
	             }
	        }   
	        return count;
	    }

}
