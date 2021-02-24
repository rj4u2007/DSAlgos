package com.practice.Trees;

public class BinaryTree {

	static class BST {
	    public int value;
	    public BST left;
	    public BST right;

	    public BST(int value) {
	      this.value = value;
	    }

	    public BST insert(int value) {
				BST temp = this;
				if(temp != null) {
					if(value < temp.value) {
						if(temp.left != null) {
							temp = temp.left;
							temp.insert(value);						
						} else {
							BST newNode = new BST(value);
							newNode.left = null;
							newNode.right = null;
							temp.left = newNode;
						}

					} else if(value >= temp.value) {
						if(temp.right != null) {
							temp = temp.right;
							temp.insert(value);						
						} else {
							BST newNode = new BST(value);
							newNode.left = null;
							newNode.right = null;
							temp.right = newNode;
						}
					}
				}
	      return this;
	    }

	    public boolean contains(int value) {
				BST temp = this;
				if(temp != null) {
					if(temp.value == value) {
						return true;
					} else {
						if(temp.value < value) {
							temp = temp.right;
							if(temp!= null) {
								return temp.contains(value);
							}	
							return false;
						} else if(temp.value > value) {
							temp = temp.left;
							if(temp!= null) {
								return temp.contains(value);
							} else return false;
							
						}
					}
				} else 
						return false;
				return false;
	    }

	    public BST remove(int value) {
				BST temp = this;
				if(temp.value == value) {
					// When it is the leaf node
						if(temp.left == null && temp.right == null) {
							temp = null;
						}
					
					// When matching element has one child
							else if(temp.left == null || temp.right == null) {
								if(temp.left != null) {
									temp.value = temp.left.value;
									temp.left = null;
								} else {
									temp.value = temp.right.value;
									temp.right = null;
								}
						}
					
					// When matching element has two children  
						else {
							temp.value = minV(temp.right);
							BST temp1 = temp.right;
							temp1 = temp1.remove(temp.value);
						}
				} else {
					if(value > temp.value) {
						temp= temp.right;
						temp.remove(value);
					} else {
						temp = temp.left;
						temp.remove(value);
					}
				}
	      return this;
	    }
			
			public int minV(BST root) {
				int min = Integer.MAX_VALUE;
				while(root != null) {
					min = root.value;
					root = root.left;
				}
				return min;
			}
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
