package com.jshen;

import java.util.LinkedList;
import java.util.List;

public class PathSum {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    //find all root-to-leaf paths where each path's sum equals the given sum.
    //leaf mean TreeNode has no children, so we don't need to care path that added up the sum in the middle, it got to be a completed path
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList<>();
        result.add(getPath(root, sum));

    }



}
