package com.jshen;

public class LowestCommonAncestor {
//All of the nodes' values will be unique.
//p and q are different and both values will exist in the BST.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    //binary search tree is the key point, we need to compare the p, q's value to root
    //once we found p < root && p > root, root is the answer
    //if p and q are both less than or greater than root, they are at the same side of subtree, and we need to move root to root.left, until we found p and q are at different sides
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;

        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }

        if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

}
