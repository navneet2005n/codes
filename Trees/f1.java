package Trees;
import java.util.*;

import javax.swing.tree.TreeNode;

public class f1 {
    static class Tree {
        Node root;
    }

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static ArrayList<Integer> inordertrav(Node root) {
        ArrayList <Integer> result = new ArrayList<>();
        Stack <Node> st = new Stack<>();
        Node node = root;
        while(true){
            if(node != null){
                st.push(node);
                node = node.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                node = st.pop();
                result.add(node.data);
                node = node.right;
            }
        }
        return result;
    }

    public static ArrayList<Integer> postordertrav(Node root) {
        ArrayList <Integer> result = new ArrayList<>();
        Stack <Node> st1 = new Stack<>();
        Stack <Node> st2 = new Stack<>();
        st1.add(root);
        if(root == null) return result;
        while(!st1.isEmpty()){
            Node curr = st1.pop();
            st2.push(curr);
            if(curr.left != null) st1.add(curr.left);
            if(curr.right != null) st1.add(curr.right);
        }
        while(!st2.isEmpty()){
            result.add(st2.pop().data);
        }
        return result;
    }

    public static int mxheight(Node root) {
    if (root == null) return 0;
    Queue <Node> q = new LinkedList<>();
    q.add(root);
    int height = 0;
    while (!q.isEmpty()) {
        int size = q.size();  
        for (int i = 0; i < size; i++) {
            Node curr = q.poll();
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
        height++; 
    }
    return height;
    }

    public static boolean isBalanced(Node root) {
        return dfsHeight(root) != -1;
    }

// EXAMPLE ::: (for next question)
    //     1
    //    / \
    //   2   3
    //  / \
    // 4   5

    public static int dfsHeight(Node root) {
        if (root == null) return 0;

        int leftHeight = dfsHeight(root.left);
        if (leftHeight == -1) return -1;

        int rightHeight = dfsHeight(root.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }

// EXAMPLE ::: (for next question)
    //     1
    //    / \
    //   2   3
    //  / \
    // 4   5

    public static int diameter = 0;
    public static int diameterOfBinaryTree(Node root) {
        dfsHeight1(root);
        return diameter;
    }

    public static int dfsHeight1(Node root) {
        if (root == null) return 0;
        int leftHeight = dfsHeight1(root.left);
        int rightHeight = dfsHeight1(root.right);
        diameter = Math.max(diameter, leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }
 
// MAXIMUM PATH SUM :::

    public static int maxPathSum(Node root) {
        int[] maxValue = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        maxPathDown(root, maxValue);
        return maxValue[0];
    }

    public static int maxPathDown(Node node, int[] maxValue) {
        if (node == null) return 0;
        int left = Math.max(0, maxPathDown(node.left, maxValue));
        int right = Math.max(0, maxPathDown(node.right, maxValue));
        maxValue[0] = Math.max(maxValue[0], left + right + node.data);
        return Math.max(left, right) + node.data;
    }

    
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        // ArrayList <Integer> ans = inordertrav(root);
        // System.out.println(ans);
        ArrayList <Integer> ans1= postordertrav(root);
        System.out.println(ans1);
        System.out.println(mxheight(root));
        System.out.println(isBalanced(root));
        System.out.println(diameterOfBinaryTree(root));
        System.out.println(maxPathDown(root, new int[1]));
    }
}