package Trees;
import java.util.*;

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

// BOUNDARY TRAVERSAL ::: 

    public static boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }

    public static void addLeftBoundary(Node root, ArrayList<Integer> res) {
        Node cur = root.left;
        while (cur != null) {
            if (!isLeaf(cur)) res.add(cur.data);
            if (cur.left != null) cur = cur.left;
            else cur = cur.right;
        }
    }
  
    public static void addRightBoundary(Node root, ArrayList<Integer> res) {
        Node cur = root.right;
        ArrayList<Integer> tmp = new ArrayList<>();
        while (cur != null) {
            if (!isLeaf(cur)) tmp.add(cur.data);
            if (cur.right != null) cur = cur.right;
            else cur = cur.left;
        }
        for (int i = tmp.size() - 1; i >= 0; --i) {
            res.add(tmp.get(i));
        }
    }

    public static void addLeaves(Node root, ArrayList<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if (root.left != null) addLeaves(root.left, res);
        if (root.right != null) addLeaves(root.right, res);
    }

    public static ArrayList <Integer> printBoundary(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (!isLeaf(node)) ans.add(node.data);

        addLeftBoundary(node, ans);
        addLeaves(node, ans);
        addRightBoundary(node, ans);

        return ans;
    }

// TOP VIEW OF A BINARY TREE :::

public static class Pair {
    Node node;
    int hd;

    Pair(Node _node, int _hd) {
        node = _node;
        hd = _hd;
    }
}

public static ArrayList <Integer> topView(Node root) {
    ArrayList <Integer> ans = new ArrayList<>();
    if (root == null) return ans;

    Map<Integer, Integer> map = new HashMap<>();
    Queue <Pair> q = new LinkedList<>();
    q.add(new Pair(root, 0));

    int minHd = 0, maxHd = 0;

    while (!q.isEmpty()) {
        Pair it = q.remove();
        int hd = it.hd;
        Node temp = it.node;

        if (!map.containsKey(hd)) {
            map.put(hd, temp.data);
        }

        minHd = Math.min(minHd, hd);
        maxHd = Math.max(maxHd, hd);

        if (temp.left != null) q.add(new Pair(temp.left, hd - 1));
        if (temp.right != null) q.add(new Pair(temp.right, hd + 1));
    }

    for (int hd = minHd; hd <= maxHd; hd++) {
        if (map.containsKey(hd)) {
            ans.add(map.get(hd));
        }
    }
    return ans;
}

// BOTTOM VIEW :::

public static ArrayList <Integer> bottomview(Node root) {
    ArrayList <Integer> ans = new ArrayList<>();
    if (root == null) return ans;

    Map<Integer, Integer> map = new HashMap<>();
    Queue <Pair> q = new LinkedList<>();
    q.add(new Pair(root, 0));

    int minHd = 0, maxHd = 0;

    while (!q.isEmpty()) {
        Pair it = q.remove();
        int hd = it.hd;
        Node temp = it.node;

        map.put(hd, temp.data);

        minHd = Math.min(minHd, hd);
        maxHd = Math.max(maxHd, hd);

        if (temp.left != null) q.add(new Pair(temp.left, hd - 1));
        if (temp.right != null) q.add(new Pair(temp.right, hd + 1));
    }

    for (int hd = minHd; hd <= maxHd; hd++) {
        if (map.containsKey(hd)) {
            ans.add(map.get(hd));
        }
    }
    return ans;
}

// PRINT ROOT TO LEAF NODES PATHS :::   

    public static void dfs(Node root,List<List<Integer>> li,ArrayList<Integer> li1){
        if(root == null) return; 
        if(root.left == null && root.right == null){
            li1.add(root.data);
            li.add(new ArrayList<>(li1));
            return;
        }
        li1.add(root.data);
        dfs(root.left,li,li1);
        li1.remove(li1.size()-1);
        dfs(root.right,li,li1);
    }

    public static List<List<Integer>> allRootToLeaf(Node root) {
        List<List<Integer>> li = new ArrayList<>();
        if(root  == null) return li;
        dfs(root,li,new ArrayList<>());
        return li;
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
        ArrayList <Integer> ans = printBoundary(root);
        System.out.println(ans);
        System.out.println("Top View: " + topView(root));
        System.out.println("Bottom View: " + bottomview(root));
        List<List<Integer>> l = allRootToLeaf(root);
        System.out.println(l);
    }
}
