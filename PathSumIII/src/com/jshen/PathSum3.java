package com.jshen;

public class PathSum3 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

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


//    public int pathSum(TreeNode root, int sum){
//        int res = 0;
//        if(root == null)
//            return res;
//        if(sum == root.val)
//            res++;
//        // without root
//        res += pathSum(root.left, sum);
//        res += pathSum(root.right, sum);
//        // with root;
//        res += pathSum(root.left, sum - root.val);
//        res += pathSum(root.right, sum - root.val);
//        return res;
//    }
}
