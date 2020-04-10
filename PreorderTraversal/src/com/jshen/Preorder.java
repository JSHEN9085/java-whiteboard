package com.jshen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Preorder {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    //iterative solution
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Stack<TreeNode> treeStack = new Stack<>();
        treeStack.push(root);
        while(!treeStack.isEmpty()){
        //based on the question left node add to the ArrayList first
        //this means in the stack, we push right node first and then left node, so left node will be out first and added to the array
        //so in below if() statement, we handle right side first and then left
            TreeNode current = treeStack.pop();
            result.add(current.val);
            if(current.right != null){
                treeStack.push(current.right);
            }
            if(current.left != null){
                treeStack.push(current.left);
            }
        }
        return result;
    }

    //recursion solution
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> result = new LinkedList<>();
//        if(root == null) return result;
//        result.add(root.val);
//        result.addAll(preorderTraversal(root.left));// ask Java to run left subtree recursion first so left tree is added first
//        result.addAll(preorderTraversal(root.right));
//        return result;
//    }

    //recursion solution with helper, we don't need to create new LinkedList each time
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> result = new LinkedList<>();
//        if(root == null) return result;
//        result.add(root.val);
//        helper(root.left, result); //ask Java to run left subtree recursion first so left tree is added first
//        helper(root.right, result);
//        return result;
//    }
//
//    private void helper(TreeNode root, List<Integer> currentList){
//        if(root == null) return;
//        currentList.add(root.val);
//        helper(root.left, currentList); //ask Java to run left subtree recursion first so left tree is added first
//        helper(root.right, currentList);
//    }
}
