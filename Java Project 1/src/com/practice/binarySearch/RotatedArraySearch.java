package com.practice.binarySearch;

public class RotatedArraySearch {

	public static void main(String[] args) {
		int[] array = {33, 37, 45, 61, 71, 72, 73, 355, 0, 1, 21};
		int target = 355;
		System.out.println(shiftedBinarySearch(array, target));

	}
	
	 public static int shiftedBinarySearch(int[] array, int target) {
		    int start = 0;
				int end = array.length -1 ;
				
				while(start <= end) {
					int mid = start + (end-start)/2;
					
					// Left array is sorted
					if(array[start] <= array[mid]) {
						if(target <= array[mid] && target >= array[start]) {
							return binarySearch(array, start, mid, target);
						} else {
								return binarySearch(array, mid+1, end, target);
						}
					} else if(array[mid] <= array[end]) {
						if(target <= array[end] && target >= array[mid]) {
							return binarySearch(array, mid, end, target);
						} else {
							return binarySearch(array, start, mid-1, target);
						}
					}
				}
				return -1;
		  }
			
			public static int binarySearch(int[] array, int start, int end, int target){
				while(start <= end) {
					int mid = start +(end-start)/2;
					if(target == array[mid]) {
						return mid;
					} else if(target < array[mid]) {
						end = mid -1;
					} else {
						start = mid + 1;
					}
				}
				return -1;
			}

}
