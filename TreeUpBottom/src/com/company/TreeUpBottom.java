package com.company;
import java.util.*;


//Given a binary tree, return the level order traversal of
//its nodes' values. (ie, from left to right, level by level).
//     3
//    / \
//   9  20
//     /  \
//    15   7

//return its level order traversal as:
//  [
//    [3],
//    [9,20],
//    [15,7]
//  ]
public class TreeUpBottom {
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

    }
}
