package com.practice.Arrays;

import java.util.HashSet;
import java.util.Set;

public class SingleCycleCheck {

	public static void main(String[] args) {
		//int[] array =  {10, 11, -6, -23, -2, 3, 88, 909, -26};
		int[] array =  {1, -1, 1, -1};
		System.out.println(hasSingleCycle(array));

	}
	
	public static boolean hasSingleCycle(int[] array) {
	    //int[] result = new int[array.length];
			Set<Integer> result = new HashSet<Integer>(array.length);
			
			for(int i=0; i < array.length; i++) {
				System.out.print(array[i] + " ");
				int landingIndex = i + array[i];
				if(landingIndex < 0) {
					landingIndex = (array.length + landingIndex%array.length)%array.length;
				} else if(landingIndex > array.length - 1) {
					landingIndex = (landingIndex % array.length);
				}
				result.add(landingIndex);
			}
			System.out.println();
			System.out.println(result);
			
			if(result.size() == array.length) {
				return true;
			}
	    return false;
	  }

}
