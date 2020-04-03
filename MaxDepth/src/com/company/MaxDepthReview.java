package com.company;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthReview {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

//  Solution 1 - Recursion
//    public int maxDepth(TreeNode root) {
//        if(root == null){
//            return 0;
//        }
//        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
//    }

//  solution 2 - BFS
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        ArrayDeque<TreeNode> treeQueue = new ArrayDeque<>();
        treeQueue.addLast(root);
        int count = 0;
        while(!treeQueue.isEmpty()){
            int size = treeQueue.size();
            while(size > 0){
                TreeNode currentNode = treeQueue.poll();

                if(currentNode.left != null){
                    treeQueue.addLast(currentNode.left);
                }
                if(currentNode.right != null){
                    treeQueue.addLast(currentNode.right);
                }
                size--;
            }
            count++;
        }
        return count;
    }
}
