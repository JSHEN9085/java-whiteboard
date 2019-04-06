package com.company;
//Given two binary trees, write a function to check if they are the same or not.
//Two binary trees are considered the same if they are structurally identical and
//the nodes have the same value.
//Input:   1         1
//        / \       / \
//       2   3     2   3
//      [1,2,3],  [1,2,3]

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){ //the first step or the last step, if both are null at the beginning return true, second (follow the example) in both tree 2.left are null, we are at the end of the comparison, so return true;
            return true;
        } else if (p == null || q == null){ // at the middle of the comparison, if one is them are null, which means not same, return false;
            return false;
        } else if (p.val != q.val){ // at the middle of the comparison, if one of them have different value, return false;
            return false;
        } else { // if we are not at the end or not returning false at the middle, put their next node into this methods and jump into recursion;
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
