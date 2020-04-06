package com.company;

public class PathSumReview {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        } else if(root.right == null && root.left == null && root.val == sum){
            return true;
        } else {
            return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        }
    }
}
