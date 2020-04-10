package com.jshen;

public class PathSum3 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    //solution with helper, this is brute force solution
    //we need helper function because we are running two recursions here
    //one is from root, and one is from its children
    //its time is O(n^2), starts from root, fine any path, and then treat its children as root, and then run the whole process again
    //that is why root goes into helper function and its children start from pathSum.
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return getWays(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int getWays(TreeNode root, int sum){
        int ways = 0;
        if(root.val == sum) ways+=1;
        if(root.left != null) ways += getWays(root.left, sum - root.val);
        if(root.right != null) ways += getWays(root.right, sum - root.val);
        return ways;
    }

}
