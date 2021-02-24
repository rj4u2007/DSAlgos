package com.practice.DynamicProgramming;

public class NumOfUniquePaths {

	
	/*
	 * 
	 * Given a A X B matrix with your initial position at the top-left cell, 
	 * find the number of possible unique paths to reach the bottom-right 
	 * cell of the matrix from the initial position.
	 * 
	 * Note: Possible moves can be either down or right at any point in time,
	 * i.e., we can move to matrix[i+1][j] or matrix[i][j+1] from 
	 * matrix[i][j].
	 * 
	 * https://www.youtube.com/watch?v=rBAxUTqvlQA
	 */
	public static void main(String[] args) {
		System.out.println(NumberOfPath(3, 4));

	}
	
	public static int NumberOfPath(int a, int b) {
	    
	    if(a==0 || b==0) {
	        return 1;
	    }
	    
	    int[][] t = new int[a+1][b+1];
	    
	    for(int i=0; i<a+1; i++) {
	        for(int j=0; j<b+1; j++) {
	            if(i==0 || j==0) {
	                t[i][j] = 1;
	            }  else {
	                    t[i][j] = t[i-1][j] + t[i][j-1];
	                }
	            }
	        }
	        
	        return t[a-1][b-1];
	    }

}
