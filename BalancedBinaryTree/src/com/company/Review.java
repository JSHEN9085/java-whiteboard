package com.company;

public class Review {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){ val = x; }
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        if(Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1){
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int maxDepth(TreeNode root){
        if(root == null) return 0;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
