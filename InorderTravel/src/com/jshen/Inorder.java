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
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> result = new ArrayList<>();
       if(root == null) return result;

        Stack<TreeNode> treeStack = new Stack<>();
        pollAllLeft(root, treeStack); //pushing all the left children into stack

        while(!treeStack.isEmpty()){
            TreeNode current = treeStack.pop(); //since we push all left children into the stack, so every stack we pop here is from left side
            result.add(current.val); //add its value to the list
            pollAllLeft(current.right, treeStack); //key point: the left node on 2nd level is the root of 3rd level, so if we process all left nodes, we won't miss the "root" and therefore we just need to process the right children here, right children will be processed here and once stack is empty, we are done.
        }
        return result;
    }

    private void pollAllLeft (TreeNode root, Stack<TreeNode> treeStack){
        while(root != null){
            treeStack.push(root);
            root = root.left;
        }
    }

//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        if(root == null) return result;
//
//        Stack<TreeNode> treeStack = new Stack<>();
//        TreeNode current = root;
//        while(!treeStack.isEmpty()){
//            while(current != null){
//                treeStack.push(root);
//                root = root.left;
//            }
//            current = treeStack.pop();
//            result.add(current.val);
//            current = current.right;
//        }
//        return result;
//    }

//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<Integer>();
//
//        Stack<TreeNode> stack = new Stack<TreeNode>();
//        TreeNode cur = root;
//
//        while(cur!=null || !stack.empty()){
//            while(cur!=null){
//                stack.add(cur);
//                cur = cur.left;
//            }
//            cur = stack.pop();
//            list.add(cur.val);
//            cur = cur.right;
//        }
//
//        return list;
//    }

//    public List<Integer> inorderTraversal(TreeNode root) {
//        Stack<TreeNode> stack = new Stack<>();
//        List<Integer> ret = new ArrayList<>();
//        while (true) {
//            while (root != null) {
//                stack.push(root);
//                root = root.left;
//            }
//            if (stack.isEmpty()) {
//                break;  // no node left
//            }
//            TreeNode node = stack.pop();
//            ret.add(node.val);
//            root = node.right;
//        }
//        return ret;
//    }
}
