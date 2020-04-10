package com.jshen;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Inorder {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    //recursion solution
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        if(root == null) return result;
//        helper(root,result);
//        return result;
//    }
//
//    private void helper(TreeNode root, List<Integer> currentList){
//        if(root == null) {
//            return;
//        } else {
//            //inorder travel means left subtree -> root -> right subtree, in left subtree start from the depthest at he left, stack is implemented
//            helper(root.left, currentList);
//            currentList.add(root.val);
//            helper(root.right, currentList);
//        }
//    }

    //iterative solution
//    public List<Integer> inorderTraversal(TreeNode root) {
//       List<Integer> result = new ArrayList<>();
//       if(root == null) return result;
//
//        Stack<TreeNode> treeStack = new Stack<>();
//        pollAllLeft(root, treeStack); //pushing all the left children into stack
//
//        while(!treeStack.isEmpty()){
//            TreeNode current = treeStack.pop(); //since we push all left children into the stack, so every stack we pop here is from left side
//            result.add(current.val); //add its value to the list
//            pollAllLeft(current.right, treeStack); //key point: the left node on 2nd level is the root of 3rd level, so if we process all left nodes, we won't miss the "root" and therefore we just need to process the right children here, right children will be processed here and once stack is empty, we are done.
//        }
//        return result;
//    }
//
//    private void pollAllLeft (TreeNode root, Stack<TreeNode> treeStack){
//        while(root != null){
//            treeStack.push(root);
//            root = root.left;
//        }
//    }

    //iterative solution without helper function (but harder to understand)
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Stack<TreeNode> treeStack = new Stack<>();
        TreeNode current = root;

        while(current != null || !treeStack.isEmpty()){
            while(current != null){ //first add all left children into the Stack
                treeStack.push(current);
                current = current.left;
            }
            current = treeStack.pop(); //starts popping left children
            result.add(current.val); // add left children value into the list
            current = current.right; //handle the right children and then jump back to the while loop to add its left child(current.right.left)
        }
        return result;
    }
}

//details
//for tree        7
//              /   \
//             5     8
//            / \   / \
//           4   6 7  10
//1st while loop: adding 7, 5, 4 into the stack, 4 is the last in. current stack is [4, 5, 7] (left is last in, right is first in)
//then left children being pop(), 4 is added to the list first, current list is [4], current stack is [5, 7]
//4.right is null, so skip while loop, and then current is pop() as 5, 5 is added to the list, current list is [4, 5], current stack is [7]
//5.right is 6, so execute the while loop again, 6 pushed into the stack, as last in so first out in next round, current stack is [6, 7]
//6 is pop() out from the stack, so 6 added to the list, current list is [4, 5, 6], current stack is [7]
//6.right is null, so skipped the while loop, current is pop() and it is 7 and 7 is added to the list,
//7.right is 8, execute the while loop again, in the right subtree, every left children will be added to the stack,
//current list is [4, 5, 6, 7], current stack [7, 8]
//then do the same thing as left subtree