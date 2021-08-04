package com.practice.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = {8, 5, 2, 9, 5, 6, 3};
		System.out.print("Original Array : ");
		for(int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();
		mergeSort(array);
		System.out.print("Merge Sorted Array : ");
		for(int n:array ) {
			System.out.print(n + " ");
		}
	}
	
	static int start = 0;
	public static int[] mergeSort(int[] array) {
	    int n = array.length;
			if(n < 2) {
				return array;
			} 
			int mid = n/2;
			int[] left = new int[mid];
			int[] right = new int[n - mid];
			for(int i=0; i<mid; i++ ){
				left[i] = array[i];
			}
			for(int j=0; j<n - mid;j++) {
				right[j] = array[mid+j];
			}
			mergeSort(left);
			mergeSort(right);
			merge(left, right, array, start);
	    return array;
	  }
		
		public static void merge(int[] left, int[] right, int[] array, int start) {
			int l = 0;
			int r = 0;
			while(l < left.length && r < right.length) {
				if(left[l] <= right[r]) {
					array[start] = left[l];
					l++;
				} else {
					array[start] = right[r];
					r++;
				}
				start++;
			}
		}

}
