package com.company;
import java.util.*;


//Given a binary tree, return the level order traversal of
//its nodes' values. (ie, from left to right, level by level).
//     3
//    / \
//   9  20
//     /  \
//    15   7

//return its level order traversal as:
//  [
//    [3],
//    [9,20],
//    [15,7]
//  ]
public class TreeTopBottom {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; };
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new LinkedList<>();
            for(int i = 0; i < size; i++){
                TreeNode current = queue.remove();
                list.add(current.val);

                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
            result.add(list); //method is almost same as TreeBottomUp, only difference is how we add the sublist to the result
        }
        return result;
    }
}
