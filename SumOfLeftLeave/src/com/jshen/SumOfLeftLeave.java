package com.jshen;

public class SumOfLeftLeave {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return getSum(root, false);
    }

    private int getSum(TreeNode root, boolean isLeft){
        if(root == null) return 0;

        if(isLeft == true && root.left == null && root.right == null){
            return root.val;
        } else {
            return getSum(root.left, true) + getSum(root.right, false);
        }
    }


}
