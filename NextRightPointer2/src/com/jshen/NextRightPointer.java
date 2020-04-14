package com.jshen;

public class NextRightPointer {
    class Node {
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

    //time O(n), space O(1)
    public Node connect(Node root) {
        if(root == null) return null;

        Node upperLevel = root;
        Node pointer = new Node(0);// create a dummy Node and iterate it from the left side of each level
        Node currentLevel = pointer; //save the position of pointer since pointer keeps moving

        while(upperLevel != null){                // create pointer that iterate the current level, pointer.next = left here
            if(upperLevel.left != null){          //              root
                pointer.next = upperLevel.left;   //              /  \
                pointer = pointer.next;           //  pointer  left  right
            }                                     // pointer moved from dummy to left Node after the first if statement
            if(upperLevel.right != null){
                pointer.next = upperLevel.right;  // started building next relation in the 2nd if statement, the main point is root.left.next = root.right
                pointer = pointer.next;
            }

            if(upperLevel.next != null){          //since upper level was iterated in last loop, so next relationship has been established
                upperLevel = upperLevel.next;     //keep moving the upper level until to the very right, and then keep running the while loop
            } else {
                upperLevel = currentLevel.next;   //when upper level reaches to the end(very right) upperLevel.next == null
                // currentLevel saved the original pointer position, and currentLevel.next is same as root.left, main point is moving upperLevel down to the current level.
                currentLevel.next = null;         //reset currentLevel
                pointer = currentLevel;           //reset pointer, now currentLevel and pointer returned back to the initial state, that has val 0, and no next Node.

                //**when upperLevel reaches the very bottom row, it won't execute 1st and 2nd if statement as bottom row don't have children
                //as pointer is not changed, so pointer.next is null and currentLevel.next is same as null.
                //upperLevel = currentLevel.next = null, this will end the while loop
            }
        }
        return root;
    }
}
