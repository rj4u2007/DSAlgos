package com.practice.Arrays;

public class SubArraySort {

	public static void main(String[] args) {
		// [2 , 1]
		//  0   1
		int[] arr = new int[] {2,1};
	//	int[] arr = new int[] {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19}; 
		System.out.println(subarraySort(arr)[0] + " " + subarraySort(arr)[1]);

	}

	public static int[] subarraySort(int[] array) {
		int length = array.length;
		int minIndex = -1;
		int maxIndex = -1;
		int first = -1;
		int last = -1;
		for(int i = 0; i < length - 2; i++) {
			if(array[i] > array[i+1]) {
				first = i;
				break;
			}				
		}
		for(int j=length-1; j>0 ; j--) {
			if(array[j] < array[j-1]) {
				last = j;
				break;
			}
		}
		int minVal = Integer.MAX_VALUE;
		int maxVal = Integer.MIN_VALUE;
		if(first != -1 && last != -1) {
			while(first <= last) {
				if(array[first] < minVal) {
					minVal = array[first];
				}
				if(array[first] > maxVal) {
					maxVal = array[first];
				}
				first++;
			}			
		}

		int begin = -1;
		int end = -1;
		for(int i=0; i<length; i++) {
			if(minVal < array[i]) {
				begin = i; 
				break;
			}
		}
		for(int j =  length-1; j>=0; j-- ) {
			if(maxVal > array[j]) {
				end = j;
				break;
			}
		}
		return new int[] {begin, end};
	}

}
