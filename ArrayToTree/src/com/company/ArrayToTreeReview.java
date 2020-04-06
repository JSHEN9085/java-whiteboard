package com.company;

public class ArrayToTreeReview {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; };
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }
        return getTreeNode(nums, 0, nums.length - 1);
    }

    private TreeNode getTreeNode(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        int middle = (start + end)/2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = getTreeNode(nums, start, middle - 1);
        root.right = getTreeNode(nums, middle + 1, end);
        return root;
    }
}
