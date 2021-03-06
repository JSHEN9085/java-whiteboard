package com.company;
//Given a binary tree, find its minimum depth.
//The minimum depth is the number of nodes along the shortest
//path from the root node down to the nearest leaf node.

//     3
//    / \
//   9  20
//     /  \
//    15   7
//return its minimum depth = 2.

public class MinDepth {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        if(root.left != null && root.right != null){
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1; //just opposite to the maxDepth question
        } else {
            return Math.max(minDepth(root.left), minDepth(root.right)) + 1;
            //for this situation, the question output height 2, so we need Math.max here
            //       1
            //      / \
            //         2
        }
    }

    //original format
//    public int minDepth(TreeNode root) {
//        if (root == null){
//            return 0;
//        }
//
//        if (root.left == null && root.right == null){
//            return 1;
//        }
//
//        if (root.left == null){
//            return 1 + minDepth(root.right);
//        }
//
//        if (root.right == null){
//            return 1 + minDepth(root.left);
//        }
//        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
//    }
}
