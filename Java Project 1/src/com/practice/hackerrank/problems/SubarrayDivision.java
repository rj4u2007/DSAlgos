package com.practice.hackerrank.problems;

import java.util.ArrayList;
import java.util.List;

// https://www.hackerrank.com/challenges/the-birthday-bar/problem?isFullScreen=false&h_r=next-challenge&h_v=zen
public class SubarrayDivision {

	public static void main(String[] args) {
		List<Integer> s = new ArrayList<Integer>();
		s.add(4);
		s.add(1);
		s.add(4);
		s.add(3);
		s.add(3);
		s.add(5);
		s.add(1);
		s.add(2);
		s.add(4);
		s.add(2);
		s.add(5);
		s.add(1);
		s.add(5);
		s.add(1);
		s.add(4);
		s.add(1);
		s.add(3);
		s.add(1);
		s.add(5);
		s.add(2);
		s.add(2);
		s.add(2);
		s.add(1);
		s.add(1);
		s.add(3);
		s.add(2);
		s.add(5);
		s.add(3);
		s.add(1);
		s.add(5);
		s.add(4);
		s.add(5);
		s.add(2);
		s.add(2);
		s.add(1);
		s.add(1);
		s.add(2);
		s.add(2);
		s.add(4);
		s.add(5);	
		s.add(4);
		s.add(1);
		s.add(5);
		s.add(2);
		s.add(1);
		s.add(1);
		s.add(2);
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(2);
		s.add(4);
		s.add(4);
		s.add(1);
		s.add(3);
		s.add(2);
		s.add(2);
		s.add(3);
		s.add(1);
		s.add(5);
		s.add(4);
		s.add(4);
		s.add(1);
		s.add(4);
		s.add(2);
		s.add(1);
		s.add(2);
		s.add(1);
		s.add(5);
		s.add(1);
		s.add(3);
		s.add(3);
		s.add(4);
		s.add(2);
		s.add(1);
		s.add(5);
		s.add(5);
		s.add(4);
		s.add(2);
		s.add(2);
		s.add(3);
		s.add(3);
		s.add(4);
		s.add(3);
		s.add(1);
		s.add(2);
		s.add(1);
		s.add(2);
		s.add(4);
		s.add(3);
		
		
		
		
		System.out.println(birthday(s, 16,7));
	}
	
	
    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        if(s.size() == 1 && s.get(0) == d) {
            return 1;
        }
        if(s.size() == 1 && s.get(0) != d) {
            return 0;
        }
        for(int i=0; i<s.size()-m; i++) {
            int tempSum = s.get(i);
            for(int j=1; j<m; j++) {
                tempSum = tempSum + s.get(i+j); 
            }
            if(tempSum == d) {
                count++;
            }
        }
        return count;
    }

}
