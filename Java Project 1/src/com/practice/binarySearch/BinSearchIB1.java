package com.practice.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BinSearchIB1 {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(9);
		A.add(6);
		A.add(1);
		A.add(1);
		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(4);
		B.add(1);
		B.add(10);
		B.add(8);

		System.out.println(solve(A,B));
		
	}
	
	public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int start=0;
        int end = A.size()-1;
        int length = B.size();
        // Map to maintain the index of elements of A
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for(int i=0; i<A.size();i++) {
            indexMap.put(A.get(i), i);
        }
        
        // Sort the array to apply binary search
        Collections.sort(A);
        
        // Output Arraylist
        ArrayList<Integer> O = new ArrayList<Integer>(B.size());
        for(int j=0; j<B.size();j++) {
            O.add(binarySearch(A, start, end, B.get(j)));
        }
        
        
        // Now put the index in output array
        for(int k=0; k<length; k++) {
        	if(O.get(k) == -1) {
        		O.set(k, -1);
        	} else {
                int temp = indexMap.get(O.get(k));
               O.set(k, temp);        		
        	}
        }
        
        return O;
    }
    
    // Return the index of element which is nearest from the right
    // Return -1 if the number to be searched is greater than the max element of input
    public static int binarySearch(ArrayList<Integer> input, int start, int end, int num) {
        int temp = -1;
             while(start <= end) {
                int mid = start + (end - start)/2;
                if(num == input.get(mid)) {
                    temp = mid;
                    break;
                }
                if(num < input.get(mid)) {
                    temp = input.get(mid);
                    end = mid -1;
                    
                } else {
                	start = mid + 1;
                }
        }
        return temp;
    }


}
