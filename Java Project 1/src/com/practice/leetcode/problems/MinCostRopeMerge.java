package com.practice.leetcode.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MinCostRopeMerge {

	public static void main(String[] args) {
		long[] arr = {4,2,7,6,9};
		List<Long> list = new ArrayList<Long>();
		for(int i=0; i< arr.length;i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		
		List<Integer> input = new ArrayList<Integer>();
		input.add(4);
		input.add(2);
		input.add(3);
		input.add(6);
		//System.out.println(calcMin(input));
	//	System.out.println(calcMin(list));
		System.out.println(calcMin2(arr));
		
	}
	
	public static long calcMin(List<Long> list) {
		Collections.sort(list);
		if(list.size() == 2) {
			return list.get(0) + list.get(1);
		}
		int n= list.size();
		long minCost = (n-1) *(list.get(0) + list.get(1));
//		for(int i=0; i<list.size()-1; i++) {
//			List<Integer> temp = new ArrayList<Integer>();
//			int x = list.get(i) + list.get(i+1);
//			minCost = minCost + x;
//			temp.add(x);
//			for(int j=i+1; j<list.size();j++) {
//				temp.add(list.get(j));
//			}
//		}
		for(int i=2; i<n; i++) {
			minCost = minCost + list.get(i)*(n-i);
		}
		
		
		return minCost;
	}
	
	// Using min heap
	public static long calcMin2(long[] arr) {
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		long minCost = 0L;
		for(int i =0; i<arr.length; i++) {
			pq.add(arr[i]);
		}
		
//		System.out.println("Lowest element : "+pq.peek());
//		System.out.println("Lowest element : "+pq.poll());
//		System.out.println("Lowest element : "+pq.peek());
		
		while(pq.size() != 1) {
			long min = pq.poll();
			long sec_Min = pq.poll();
			long temp = min + sec_Min;
			minCost = minCost + temp;
			pq.add(temp);
			
		}
		return minCost;
	}

}
