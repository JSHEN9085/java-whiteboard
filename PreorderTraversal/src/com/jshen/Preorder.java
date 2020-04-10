package com.jshen;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Preorder {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

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
}
