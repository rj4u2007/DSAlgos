package com.practice.Trees;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindClosest {

	static HashMap<Integer, Integer> result = new HashMap<Integer,Integer>();
	public static int findClosestValueInBst(BST tree, int target) {	
		result = findDifferenceSet(tree, target);
		Iterator hmIterator = result.entrySet().iterator(); 
		int min = Integer.MAX_VALUE;
		int val = -1;
		for (Map.Entry mapElement : result.entrySet()) { 
			int key = (int)mapElement.getKey(); 
			int value = ((int)mapElement.getValue()); 
			if(value < min) {
				min = value;
				val = key;
			}
		} 
		return val;
	}

	public static HashMap<Integer, Integer> findDifferenceSet(BST tree, int target) {
		BST currentNode = tree;
		while(currentNode != null) {
			if(target == currentNode.value) {
				result.put(currentNode.value, Math.abs(currentNode.value - target));
				break;
			} else if (target < currentNode.value) {
				result.put(currentNode.value, Math.abs(currentNode.value - target));
				currentNode = currentNode.left;
			} else if(target > currentNode.value) {
				result.put(currentNode.value, Math.abs(currentNode.value - target));
				currentNode = currentNode.right;
			}
		}
		return result;
	}

	static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {
	    BST root = new FindClosest.BST(100);
	    root.left = new FindClosest.BST(5);
	    root.left.left = new FindClosest.BST(2);
	    root.left.right = new FindClosest.BST(15);
	    root.right = new FindClosest.BST(502);
	    root.right.left = new FindClosest.BST(204);
	    root.right.left.left = new FindClosest.BST(203);
	    root.right.left.right = new FindClosest.BST(205);
	    root.right.left.right.right = new FindClosest.BST(207);
	    root.right.left.right.right.left = new FindClosest.BST(206);
	    root.right.left.right.right.right = new FindClosest.BST(208);
	    root.right.right = new FindClosest.BST(55000);
	    root.right.right.left = new FindClosest.BST(1001);
	    root.right.right.left.right = new FindClosest.BST(4500);

	 
	    int actual = FindClosest.findClosestValueInBst(root, -51);
	    
	    System.out.println(actual);

	}

}
