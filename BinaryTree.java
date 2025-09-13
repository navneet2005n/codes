import java.util.*;
   class BinaryTree {
    public BinaryTree() {

    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node root;

    public void populate(Scanner scanner) {
        System.out.print("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.print("Do you want to enter left of " + node.value + "? (true/false): ");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.print("Enter the value of left of " + node.value + ": ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.print("Do you want to enter right of " + node.value + "? (true/false): ");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.print("Enter the value of right of " + node.value + ": ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
    
    public void prettydisplay(){
        prettydisplay(root,0);
    }
    
    private void prettydisplay(Node node, int level){
        if(node == null){
            return;
        }
        
        prettydisplay(node.right , level+1);
        
        if(level != 0){
            for(int i=0; i<level-1; i++){
                System.out.print("|\t\t"); 
            }
            System.out.println("|----->" + node.value);
        }
        else{
            System.out.println(node.value); 
        }
        prettydisplay(node.left,level+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.prettydisplay();
    }
}