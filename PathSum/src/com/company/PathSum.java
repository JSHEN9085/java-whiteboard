package com.company;


//Given a binary tree and a sum, determine if the tree has a root-to-leaf path
//such that adding up all the values along the path equals the given sum.

public class PathSum {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }

    public boolean hasPathSum(TreeNode root, int sum){
        if(root == null){
            return false;
        } else if(root.left == null && root.right == null && root.val == sum){ //as question required, we need to find root-to-leaf path, therefore, if there is a qualified path, the last node will have null for its left and right; 
            return true;
        } else {
            return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        }
    }
}
