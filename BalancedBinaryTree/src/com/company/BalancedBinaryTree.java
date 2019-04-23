package com.company;

public class BalancedBinaryTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){ val = x; }
    }

    public boolean isBalanced(TreeNode root){
        if(root == null){
            return true;
        }

        if(root.left == null && root.right == null){
            return true;
        }

        // checking the difference of max depth of left and right;
        // if the difference in maximum depth is greater than 1, we don't need the next step
        if(Math.abs(depth(root.left) - depth(root.right)) > 1){
            return false;
        }

        // separately check left tree and right tree, make sure left and right are also binary trees
        // if we jumped to this step, it means difference in depth of left and right tree is less than 1;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    //this is used to find the maximum depth of a tree;
    private int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
}
