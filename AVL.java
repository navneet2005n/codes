public class AVL {
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
    public AVL(){
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
        display(node.right,"Right child of " + node.getValue() + ": ");
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
        return rotate(node);
    }

    private node rotate(node node){
        int balance = height(node.left) - height(node.right);
        if(balance > 1){
            if(height(node.left.left) >= height(node.left.right)){
                return rightRotate(node);
            }
            else{
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(balance < -1){
            if(height(node.right.right) >= height(node.right.left)){
                return leftRotate(node);
            }
            else{
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private node rightRotate(node node){
        node newRoot = node.left;
        node temp = newRoot.right;
        newRoot.right = node;
        node.left = temp;
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        newRoot.height = Math.max(height(newRoot.left), height(newRoot.right)) + 1;
        return newRoot;
    }

    private node leftRotate(node node){
        node newRoot = node.right;
        node temp = newRoot.left;
        newRoot.left = node;
        node.right = temp;
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        newRoot.height = Math.max(height(newRoot.left), height(newRoot.right)) + 1;
        return newRoot;
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
        AVL tree = new AVL();
        int [] nums = {5, 6, 4, 3, 2, 1, 9};
        tree.populate(nums);
        tree.display();
        System.out.println("Is the tree balanced? " + tree.balanced());
        System.out.println("Height of the tree: " + tree.height(tree.root));
        System.out.println("Is the tree empty? " + tree.isempty());     
    }
}
