package com.company;

public class SymmetricReview {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; };
    }

    public boolean isSymmetric(TreeNode root) {
        if(root != null){
            return isMirror(root.left, root.right);
        }
        return true;
    }

    public boolean isMirror(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null){
            return true;
        }
        if(node1 == null || node2 == null){
            return false;
        }
        return (node1.val == node2.val) && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }
}
