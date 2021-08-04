package com.practice.Matrices;

import java.util.ArrayList;
import java.util.List;

public class ZigZagTraverse {

	public static void main(String[] args) {
		List<List<Integer>> input = new ArrayList<List<Integer>>();

		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(3);
		l1.add(4);
		l1.add(10);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(2);
		l2.add(5);
		l2.add(9);
		l2.add(11);
		List<Integer> l3 = new ArrayList<Integer>();
		l3.add(6);
		l3.add(8);
		l3.add(12);
		l3.add(15);
		List<Integer> l4 = new ArrayList<Integer>();
		l4.add(7);
		l4.add(13);
		l4.add(14);
		l4.add(16);

		input.add(l1);
		input.add(l2);
		input.add(l3);
		input.add(l4);

		for(int i=0; i<input.size(); i++) {
			for(int j=0; j<input.get(i).size(); j++) {
				System.out.print(input.get(i).get(j) + " ");
			}
			System.out.println();
		}
		List<Integer> list = zigzagTraverse(input);
		for(int num : list)
			System.out.print(num + " ");

	}

	public static List<Integer> zigzagTraverse(List<List<Integer>> array) {
		List<Integer> output = new ArrayList<Integer>();
		int alter = 0;
		int n = array.size();
		int m = array.get(0).size();
		if(n == 1 && m == 1) {
			output.add(array.get(0).get(0));
			return output;
		}
		int i = 0;
		int j = 0;
		output.add(array.get(0).get(0));
		while(i < n || j < m) {
			if(alter % 2 == 0) {
				// Down or Right movement
				if(i < n ) {
					i++;
				} else if(j < m) {
					j++;
				}
				output.add(array.get(i).get(j));

				// Upright or Down movement
				if(j < m && i > 0) {
					i--; 
					j++;
				} else if(j < m) {
					j++;
				}
				output.add(array.get(i).get(j));
			} else {
				// Right or Down
				if(j < m) {
					j++;
				}
				else if(i > 0) {
					i--;
				}
				output.add(array.get(i).get(j));
				// Leftdown or Right
				if(j > 0 && i < n) {
					j--;
					i++;
				} else if(j < m) {
					j++;
				}
				output.add(array.get(i).get(j));
			}
			alter++;
		}
		return output;
	}
}