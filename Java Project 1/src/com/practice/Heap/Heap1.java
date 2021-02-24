package com.practice.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

// Find the kth smallest/largest element in an array
// nlogk algorithmic Time Complexity
public class Heap1 {

	public static void main(String[] args) {
		
//		Min Heap: PriorityQueue minHeap= new PriorityQueue<>();
//
//		Max Heap PriorityQueue maxHeap= new PriorityQueue<>(Comparator.reverseOrder());
		int[] input = {2,1,6,8,3,7};
		int k = 2;
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		
		for(int i=0; i<input.length; i++) {
			maxHeap.add(input[i]);
			minHeap.add(input[i]);
			if(maxHeap.size() > k) {
				maxHeap.poll();
			}
			if(minHeap.size() > k) {
				minHeap.poll();
			}
		}
		
		System.out.println(k +"th Minimum elemnt of array is : " + maxHeap.peek());
		System.out.println(k +"th Maximum elemnt of array is : " + minHeap.peek());
		
	}

}
