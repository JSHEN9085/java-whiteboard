package com.jshen;

import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePath {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<String> binaryTreePaths(TreeNode root) {

    }



    //DFS
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> result = new LinkedList<>();
//        if(root == null) return result;
//
//        Stack<String> path = new Stack<>(); //key point is I maintain a Stack for String here
//        path.push("");
//
//        Stack<TreeNode> treeStack = new Stack<>();
//        treeStack.push(root);
//        while(!treeStack.isEmpty()){
//            TreeNode currentNode = treeStack.pop();
//            String currentPath = path.pop(); //as I pop() current tree Node, I also pop() the String. Similar to the maxDepth, I maintained currentPath up to the current Node
//            if(currentNode.left == null && currentNode.right == null){
//                result.add(0, currentPath + currentNode.val);
//            }
//            if(currentNode.left != null){
//                treeStack.push(currentNode.left);
//                path.push(currentPath + currentNode.val + "->");
//            }
//            if(currentNode.right != null){
//                treeStack.push(currentNode.right);
//                path.push(currentPath + currentNode.val + "->");
//            }
//        }
//        return result;
    }
}
