package com.jshen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NextRightPointers {
    public class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    //iterate solution, time is O(n), space is O(n), this is general solution, even for unperfect binary tree
//    public Node connect(Node root) {
//        if(root == null) return null;
//
//        LinkedList<Node> nodeQueue = new LinkedList<>();
//        nodeQueue.add(root);
//
//        while(!nodeQueue.isEmpty()){
//            int size = nodeQueue.size();
//            while(size > 0){
//                Node current = nodeQueue.poll();
//                if(size > 1) {  //can't use if(nodeQueue.peek() != null) to determine, because queue is dynamic, while size is fixed for each level
//                    current.next = nodeQueue.peek();
//                }
//
//                if(current.left != null){
//                    nodeQueue.add(current.left);
//                }
//                if(current.right != null){
//                    nodeQueue.add(current.right);
//                }
//                size--;
//            }
//        }
//        return root;
//    }

    //iterative solution space O(1), using two pointers. this only works in perfect binary tree
    public Node connect(Node root) {
        if(root == null) return null;
        Node leftHead = root;
        while(leftHead.left != null){
            Node pointer = leftHead;
            while(pointer != null){
                pointer.left.next = pointer.right; //example root.left.next = root.right
                if(pointer.next != null){
                    pointer.right.next = pointer.next.left;
                }
                pointer = pointer.next;
            }
            leftHead = leftHead.left; //go to the next level after current level finished
        }
        return root;
    }
}
