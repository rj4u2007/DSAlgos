package com.practice.hackerrank.problems;

import java.util.ArrayList;
import java.util.List;

public class JumpingClouds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(0);
		input.add(0);
		input.add(0);
		input.add(1);
		input.add(0);
		input.add(0);
		
		System.out.println(jumpingOnClouds(input));

	}
	
    public static int jumpingOnClouds(List<Integer> c) {
    int count = 0;
    int pos = 0;
    while(pos < c.size()){
        if(pos + 2 < c.size() && c.get(pos+2) != 1) {
            pos = pos + 2;
        } else if(pos + 1 < c.size() && c.get(pos+1) != 1) {
            pos = pos + 1;
        } else {
        	break;
        }
        count++;
    }
    return count;

    }

}
