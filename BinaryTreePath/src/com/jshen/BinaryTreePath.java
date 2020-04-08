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

    //recursion solution version 1(with String)
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> result = new LinkedList<>();
//        if(root != null) pathTracking(root, "", result);
//        return result;
//    }
//
//    private void pathTracking(TreeNode root, String path, List<String> result){
//        if(root.left == null && root.right == null) result.add(path + root.val);
//
//        if(root.left != null) pathTracking(root.left, path + root.val + "->", result);
//
//        if(root.right != null) pathTracking(root.right, path + root.val + "->", result);
//    }

    //recursion version 2(with StringBuilder)
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new LinkedList<>();
        StringBuilder path = new StringBuilder();
        if(root != null) pathTracking(root, path, result);
        return result;
    }

    private void pathTracking(TreeNode root, StringBuilder path, List<String> result){
        if(root == null) return;

        int len = path.length();
        System.out.println(len);
        path.append(root.val);
        System.out.println(path.toString());
        if(root.left == null && root.right == null){
            result.add(path.toString());
        } else {
            path.append("->");
            pathTracking(root.left, path, result);
            pathTracking(root.right, path, result);
        }
        path.setLength(len);
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
//    }
}
