package com.practice.Arrays;

import java.util.ArrayList;

public class ConcentricArray {

	public static void main(String[] args) {
		//System.out.println(prettyPrint(7));
		ArrayList<ArrayList<Integer>> a = prettyPrint(9);
		for(int i=0; i<a.size();i++) {
			System.out.println(a.get(i));
		}

	}

    public static ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        ArrayList<ArrayList<Integer>> op = new ArrayList<ArrayList<Integer>>();
        
        int dim = A*2 - 1;
        int[][] output = new int[dim][dim];
        int start =0;
        int end = dim-1;
        while(A > 0) {
            for(int i=start; i<=end ; i++) {
                for(int j=start; j<=end; j++) {
                    if(i==start || j ==start || i ==end || j ==end) {
                        output[i][j] = A;
                    }
                }
            }     
        start++;
        end--;
        A--;
        }
        for(int i=0; i<output.length;i++) {
            ArrayList<Integer> a = new ArrayList<Integer>();
            for(int j=0; j<output.length;j++) {
                a.add(output[i][j]);
            }
            op.add(a);
        }

        return op;
    }
}
