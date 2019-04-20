package com.company;

//Given the sorted array: [-10,-3,0,5,9],
//One possible answer is: [0,-3,9,-10,null,5], which represents
//the following height balanced BST:

//      0
//     / \
//   -3   9
//   /   /
// -10  5

public class ArrayToTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; };
    }

    public TreeNode sortedArrayToBST(int[] nums){
        if(nums == null || nums.length == 0){
            return null;
        }

        return getTreeNode(nums, 0, nums.length - 1);
    }

    private TreeNode getTreeNode(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        int middle = (start + end) / 2;
        TreeNode n = new TreeNode(nums[middle]);
        n.left = getTreeNode(nums, start, middle - 1);
        n.right = getTreeNode(nums, middle + 1, end);
        return n;
    }
}
//hint: head of every subtree is always the middle point of the interval
// [1, 2, 3, 4, 5, 6, 7]
//         4
//        / \
//       2   6
// like above example, 2 is the middle point between beginning and 4, so it must be the left node of 4
// and then we keep finding the middle point and set it as left node, and we do
// same thing at the right side. 