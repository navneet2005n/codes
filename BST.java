public class BST {
    public class node{
        private int value;
        private node left;
        private node right;
        private int height;
        public node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    } 
    private node root;
    public BST(){
    }

    public int height(node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isempty(){
        return root == null;
    }

    public void display(){
        display(root, "Root node:");
    }
    private void display(node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left,"Left child of " + node.getValue() + ": ");
        display(node.right,"Right child of " + node.getValue()+ ": ");
}
    
    public void insert(int value){
        root = insert(root, value);
    }

    private node insert(node node, int value){
        if(node == null){
            return new node(value);
        }
        if(value < node.getValue()){
            node.left = insert(node.left, value);
        }
        else if(value > node.getValue()){
            node.right = insert(node.right, value);
        }
        else{
            return node;
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(node node){
        if(node == null){
            return true;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }
        return balanced(node.left) && balanced(node.right);
    }

    public void populate(int [] nums){
        for(int i = 0; i < nums.length; i++){
            this.insert(nums[i]);
        }
    }
    public static void main(String[] args) {
        BST bst = new BST();
        int[] nums = {10, 5, 15, 3, 7, 12, 18};
        bst.populate(nums);
        bst.display();
        System.out.println("Is the tree balanced? " + bst.balanced());
        System.out.println("Height of the tree: " + bst.height(bst.root)); 
    }
}