package com.practice.hackerrank.problems;

public class ChocolateFeast {

	public static void main(String[] args) {
		System.out.println(chocolateFeast(38325 ,35990, 17382));
	}
	
	public static int chocolateFeast(int n, int c, int m) {
        // 10 2 5  = 6
        // 6 2 2 = 5
        int initialBought = n/c;
        if(initialBought == 0) {
            return 0;
        }
        if(initialBought < m) {
            return initialBought;
        }
        int count = initialBought;
        while(initialBought/m != 0) {
            if(initialBought%m == 0 && initialBought/m == 1) {
                return count+1;
            }
            count = count + initialBought/m ;
            initialBought = initialBought - (initialBought/m);
            //count++;
        }
        return count;
    }

}
