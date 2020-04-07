package com.jshen;

public class InvertBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        //swap the children of the root
        TreeNode tem = root.left;
        root.left = root.right;
        root.right = tem;

        //but the remaining subtree still need to be swapped
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);


        return root;
    }
}
