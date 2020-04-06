package com.jshen;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeToList {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root == null) return result;

        Queue<TreeNode> treeQueue = new LinkedList<>(); //using BFS to solve this problem, using LinkedList is faster than ArrayDeque
        treeQueue.add(root);

        while(!treeQueue.isEmpty()){
            int size = treeQueue.size();
            List<Integer> eachLevel = new LinkedList<>();

            for(int i = 0; i< size; i++){
                TreeNode currentNode = treeQueue.poll();
                eachLevel.add(currentNode.val);

                if(currentNode.left != null){
                    treeQueue.add(currentNode.left);
                }
                if(currentNode.right != null){
                    treeQueue.add(currentNode.right);
                }
            }
            result.add(0, eachLevel); //adding each level to the first position as question required
        }
        return result;
    }
}
