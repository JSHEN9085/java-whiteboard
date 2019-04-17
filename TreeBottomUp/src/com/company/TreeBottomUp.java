package com.company;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//Given a binary tree, return the bottom-up level order traversal
//of its nodes' values. (ie, from left to right, level by level from leaf to root).
//     3
//    / \
//   9  20
//     /  \
//    15   7

//return its bottom-up level order traversal as:
//[
// [15,7],
// [9,20],
// [3]
//]
// https://www.youtube.com/watch?v=B0n3gqPKKic

public class TreeBottomUp {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; };
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root == null){
            return result;
        }     //normal check, if input is null, return empty list;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size(); //save the size of queue before we running the loop, because once the for loop started, q.size() is changing every round;
            List<Integer> list = new LinkedList<>();
            for(int i = 0; i < size; i++){ // the initial size is how many node on each level;
                TreeNode current = q.remove();
                list.add(current.val);
                if(current.left != null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                } //line 43 ~ 48 we added all the node in the next level(downward) to the queue, so in the next while loop, q.size() is the number of nodes in that level.
            }
            result.add(0, list); //always add from the beginning, so the list is bottom up
        }
        return result;
    }
}
