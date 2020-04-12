package com.jshen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Postorder {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    //post order is left -> right -> root travel
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Stack<TreeNode> treeStack = new Stack<>();
        treeStack.push(root);

        while(!treeStack.isEmpty()){
            TreeNode current = treeStack.pop();
            result.add(0, current.val); //key difference, we have [root] -> [right, root] -> [left -> right -> root] since we always add it to the first position

            if(current.left != null){
                treeStack.push(current.left);
            }
            if(current.right != null){
                treeStack.push(current.right);
            }
        }
        return result;
    }


}
