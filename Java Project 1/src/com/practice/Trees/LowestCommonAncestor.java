package com.practice.Trees;

public class LowestCommonAncestor {

	public static void main(String[] args) {
		

	}
	/*
	 * The concept is :
	 * Find p and q on left side, root , right side.
	 * If we find, return root.
	 */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return null;
        } 
        if(root == p || root == q) {
            return root;
        }
        // Inorder
        TreeNode left = lowestCommonAncestor(root.left, p ,q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        if(left != null && right != null) {
            return root;
        } 
        else {
            if(left != null) {
                return left;
            } else return right;
        } 
        
            
    }
    
     public class TreeNode {
    	      int val;
    	      TreeNode left;
    	      TreeNode right;
    	      TreeNode(int x) { val = x; }
    	  }

}
