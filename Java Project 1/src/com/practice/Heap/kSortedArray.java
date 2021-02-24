package com.practice.Heap;

import java.util.PriorityQueue;

public class kSortedArray {

	public static void main(String[] args) {
		int[] array = {3, 2, 1, 5, 4, 7, 6, 5};
		int k =3;
		
		array = sortKSortedArray(array,k);
		for(int num : array) {
			System.out.println(num);
		}

	}
	
	public static int[] sortKSortedArray(int[] array, int k) {
	    
		if( k > 0) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		for(int i=0; i<array.length; i++) {
			minHeap.add(array[i]);
			if(minHeap.size() > k) {
				array[i-k] = minHeap.peek();
				minHeap.poll();
			}
		}
		for(int j = array.length - minHeap.size() ; j<array.length; j++) {
			array[j] = minHeap.peek();
			minHeap.poll();
		}
		}
    return array;
  }

}
