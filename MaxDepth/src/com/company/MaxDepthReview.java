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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

//  solution 2 - BFS
//    public int maxDepth(TreeNode root) {
//        if(root == null) return 0;
//
//        ArrayDeque<TreeNode> treeQueue = new ArrayDeque<>();
//        treeQueue.addLast(root); // add the root to the queue first
//        int count = 0;
//        while(!treeQueue.isEmpty()){
//            int size = treeQueue.size(); // size here actually mean how many TreeNode in the same level.
//            while(size > 0){
//                TreeNode currentNode = treeQueue.poll(); //fetch and remove the head (getting and removing the first TreeNode)
//
//                if(currentNode.left != null){ //check if the first TreeNode has left child, if yes, add to the queue
//                    treeQueue.addLast(currentNode.left);
//                }
//                if(currentNode.right != null){ //check if the first TreeNode has right child, if yes, add to the queue
//                    treeQueue.addLast(currentNode.right);
//                }
//                size--;  //size declared at each outside while loop (line 31), once it get down to 0, we exit the inside loop
//                //for each inside loop, I added all children of existing TreeNodes to the Queue, after all existing TreeNode are gone [ArrayDeque.poll()], program exists from the inside loop, and count++
//                //when program is in the inside loop, it won't check the size, once it is declared at line 31, it represent the existing TreeNode, also the time we run the inside while loop
//                //all in all, line 31 declare the # of TreeNode at current level, also the # of inside loop's run, and inside loop add all children of existing TreeNode.
//            }
//            count++;
//        }
//        return count;
//    }

//  solution 3 DFS
//    public int maxDepth(TreeNode root) {
//        if(root == null) return 0;
//        //I maintained two stacks here, one is for tracking treeNode, one is for tracking current Depth
//        ArrayDeque<TreeNode> treeStack = new ArrayDeque<>(); //we use stack for DFS, the last in treeNode is always from the lowest level of the tree, and then we first pop it, so we always go to the next level, no matter how many treeNode at the same level
//        treeStack.push(root);
//        ArrayDeque<Integer> currentDepthStack = new ArrayDeque<>(); //each time I add treeNode to treeStack, I also add an integer represent the current depth of that treeNode
//        currentDepthStack.push(1);
//        int maxDepth = 0;
//
//        while(!treeStack.isEmpty()){
//            TreeNode currentNode = treeStack.pop(); //take the last in treeNode here
//            int currentDepth = currentDepthStack.pop(); //take the current depth of the treeNode
//            maxDepth = Math.max(maxDepth, currentDepth); //keep the maximum depth
//
//            if(currentNode.left != null){
//                treeStack.push(currentNode.left); //add the left child to treeStack
//                currentDepthStack.push(currentDepth + 1); //at the meantime, add its current depth to currentDepthStack
//            }
//            if(currentNode.right != null){
//                treeStack.push(currentNode.right);
//                currentDepthStack.push(currentDepth + 1); //since currentDepth is preset at line 63, so both children have same current level, so we won't mess up the level number
//            }
//        }
//        return maxDepth;
    }
}
