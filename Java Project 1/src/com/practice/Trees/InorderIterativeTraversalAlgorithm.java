package com.practice.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderIterativeTraversalAlgorithm {

	public static void main(String[] args) {
		// Create the BST
		BST root = new BST(1);
		root.left = new BST(2);
		root.right = new BST(3);
		root.left.left = new BST(4);
		root.left.left.right = new BST(9);
		root.right.left = new BST(6);
		root.right.right = new BST(7);
		
		inorderTraversal(root);

	}
	
	public static void inorderTraversal(BST root) {
		List<Integer> result = new ArrayList<Integer>();
		Stack<BST> stack = new Stack<BST>();
		
		boolean done = false;
		
		while(!done) {
			if(root != null) {
				stack.push(root);
				root = root.left;
			} else {
				if(stack.isEmpty()) {
					done = true;
				} else {
					BST temp = stack.pop();
					result.add(temp.value);
					temp = temp.right;
					root = temp;
				}
			}
		}
		
		for(int num : result) {
			System.out.println(num);
		}
	}
	
	static class BST {
	    public int value;
	    public BST left;
	    public BST right;

	    public BST(int value) {
	      this.value = value;
	    }
	}

}
