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

public class TreeBottomUp {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; };
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new LinkedList<>();
            for(int i = 0; i < size; i++){
                TreeNode current = q.remove();
                list.add(current.val);
                if(current.left != null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                }
            }
            result.add(0, list);;
        }
        return result;
    }
}
