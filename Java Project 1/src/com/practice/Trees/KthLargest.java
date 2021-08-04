package com.practice.Trees;

public class KthLargest {

	public static void main(String[] args) {
		BST root = new BST(15);
		root.left = new  BST(5);
		root.right = new  BST(20);
		root.left.left = new  BST(2);
		root.left.right = new  BST(5);
		root.left.left.left = new  BST(1);
		root.left.left.right = new  BST(3);
		root.right.left = new  BST(17);
		root.right.right = new  BST(22);
		
		findKthLargestValueInBst(root, 3);

	}
	
	  static class BST {
		    public int value;
		    public BST left = null;
		    public BST right = null;

		    public BST(int value) {
		      this.value = value;
		    }
		  }

		  public static void findKthLargestValueInBst(BST tree, int k) {
		    int count = 1;
		     reverseInOrder(tree, count, k);
		  }
			
			public static void reverseInOrder(BST root, int count, int k) {
				if(root == null || count >= k) {
					return ;
				} 
				reverseInOrder(root.right, count, k);
				count++;
				if(count == k) {
					System.out.println(root.value); 
					return;
				}
				reverseInOrder(root.left, count, k);
			}

}
