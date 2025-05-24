public class prefix_tree {
    static class Node { 
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    Node root;

    void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(Node node){
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
    
    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        prefix_tree tree = new prefix_tree();
        tree.root = new Node(5);
        tree.root.left = new Node(4);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(1);
        tree.preorder(tree.root); 
        System.out.println();
        tree.postorder(tree.root); 
        System.out.println();
        tree.inorder(tree.root); 
    }
}
