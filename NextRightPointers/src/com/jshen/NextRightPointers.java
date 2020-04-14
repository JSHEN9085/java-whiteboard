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

    //iterate solution, time is O(n), space is O(n)
    public Node connect(Node root) {
        if(root == null) return null;

        LinkedList<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while(!nodeQueue.isEmpty()){
            int size = nodeQueue.size();
            while(size > 0){
                Node current = nodeQueue.poll();
                if(size > 1) {  //can't use if(nodeQueue.peek() != null) to determine, because queue is dynamic, while size is fixed for each level
                    current.next = nodeQueue.peek();
                }

                if(current.left != null){
                    nodeQueue.add(current.left);
                }
                if(current.right != null){
                    nodeQueue.add(current.right);
                }
                size--;
            }
        }
        return root;
    }
}
