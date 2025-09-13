import java.util.*;
public class Trees {
   public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }   
    }

    public static int sum(Node node){
        if(node == null) return 0;
        int leftSum = sum(node.left);
        int rightSum = sum(node.right);
        return node.val + leftSum + rightSum;
    }

    public static int size(Node node){
        if(node == null) return 0;
        return 1 + size(node.left) + size(node.right);
    }

    public static int max(Node node){
        if(node == null) return Integer.MIN_VALUE;
        return Math.max(node.val, Math.max(max(node.left), max(node.right)));
    }

    public static int height(Node node){
        if(node == null) return 0;
        if(node.left == null && node.right == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }
 
    public static void nthlevel(Node node, int level){
        if(node == null) return;
        if(level == 0) System.out.print(node.val + " ");
        nthlevel(node.left, level - 1);
        nthlevel(node.right, level - 1);
    }
    
    public static void bfs(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current = queue.peek();
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
            System.out.print(current.val + " ");
            queue.remove();
        }
    }

    public static int min(Node node){
        if(node == null) return Integer.MAX_VALUE;
        return Math.min(node.val, Math.min(min(node.left), min(node.right)));
    }

    public static int product(Node node){
        if(node == null) return 1;
        return node.val * product(node.left) * product(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(9);
        Node a = new Node(6);
        Node b = new Node(4);
        root.left = a;
        root.right = b;
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);
        a.left = c;
        a.right = d;
        d.left = e;
        System.out.println(size(root)); // 6
        System.out.println(sum(root)); // 25
        System.out.println(max(root)); // 9
        System.out.println(height(root)); // 3
        System.out.println(min(root)); // 1
        System.out.println(product(root)); // 1296
        nthlevel(root, 3);
        System.out.println();
        bfs(root); // 9 6 4 3 2 1
        System.out.println();
    }
}