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
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node node = root;
        while (true) {
            if (node != null) {
                st.push(node);
                node = node.left;
            } else {
                if (st.isEmpty()) {
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
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.add(root);
        if (root == null)
            return result;
        while (!st1.isEmpty()) {
            Node curr = st1.pop();
            st2.push(curr);
            if (curr.left != null)
                st1.add(curr.left);
            if (curr.right != null)
                st1.add(curr.right);
        }
        while (!st2.isEmpty()) {
            result.add(st2.pop().data);
        }
        return result;
    }

    public static int mxheight(Node root) {
        if (root == null)
            return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int height = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            height++;
        }
        return height;
    }

    public static boolean isBalanced(Node root) {
        return dfsHeight(root) != -1;
    }

    // EXAMPLE ::: (for next question)
    // 1
    // / \
    // 2 3
    // / \
    // 4 5

    public static int dfsHeight(Node root) {
        if (root == null)
            return 0;

        int leftHeight = dfsHeight(root.left);
        if (leftHeight == -1)
            return -1;

        int rightHeight = dfsHeight(root.right);
        if (rightHeight == -1)
            return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // EXAMPLE ::: (for next question)
    // 1
    // / \
    // 2 3
    // / \
    // 4 5

    public static int diameter = 0;

    public static int diameterOfBinaryTree(Node root) {
        dfsHeight1(root);
        return diameter;
    }

    public static int dfsHeight1(Node root) {
        if (root == null)
            return 0;
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
        if (node == null)
            return 0;
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
            if (!isLeaf(cur))
                res.add(cur.data);
            if (cur.left != null)
                cur = cur.left;
            else
                cur = cur.right;
        }
    }

    public static void addRightBoundary(Node root, ArrayList<Integer> res) {
        Node cur = root.right;
        ArrayList<Integer> tmp = new ArrayList<>();
        while (cur != null) {
            if (!isLeaf(cur))
                tmp.add(cur.data);
            if (cur.right != null)
                cur = cur.right;
            else
                cur = cur.left;
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
        if (root.left != null)
            addLeaves(root.left, res);
        if (root.right != null)
            addLeaves(root.right, res);
    }

    public static ArrayList<Integer> printBoundary(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (!isLeaf(node))
            ans.add(node.data);

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

    public static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Map<Integer, Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
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

            if (temp.left != null)
                q.add(new Pair(temp.left, hd - 1));
            if (temp.right != null)
                q.add(new Pair(temp.right, hd + 1));
        }

        for (int hd = minHd; hd <= maxHd; hd++) {
            if (map.containsKey(hd)) {
                ans.add(map.get(hd));
            }
        }
        return ans;
    }

    // BOTTOM VIEW :::

    public static ArrayList<Integer> bottomview(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Map<Integer, Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        int minHd = 0, maxHd = 0;

        while (!q.isEmpty()) {
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.node;

            map.put(hd, temp.data);

            minHd = Math.min(minHd, hd);
            maxHd = Math.max(maxHd, hd);

            if (temp.left != null)
                q.add(new Pair(temp.left, hd - 1));
            if (temp.right != null)
                q.add(new Pair(temp.right, hd + 1));
        }

        for (int hd = minHd; hd <= maxHd; hd++) {
            if (map.containsKey(hd)) {
                ans.add(map.get(hd));
            }
        }
        return ans;
    }

    // PRINT ROOT TO LEAF NODES PATHS :::

    public static void dfs(Node root, List<List<Integer>> li, ArrayList<Integer> li1) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            li1.add(root.data);
            li.add(new ArrayList<>(li1));
            return;
        }
        li1.add(root.data);
        dfs(root.left, li, li1);
        li1.remove(li1.size() - 1);
        dfs(root.right, li, li1);
    }

    public static List<List<Integer>> allRootToLeaf(Node root) {
        List<List<Integer>> li = new ArrayList<>();
        if (root == null)
            return li;
        dfs(root, li, new ArrayList<>());
        return li;
    }

    // LCA OF TWO NODES IN A BINARY TREE :::

    public static Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if (left == null)
            return right;
        if (right == null)
            return left;

        else {
            return root;
        }
    }

    // Maximum Width of Binary Tree :::

    static class pair1 {
        Node node;
        int index;

        pair1(Node _node, int _index) {
            node = _node;
            index = _index;
        }
    }

    public static int widthOfBinaryTree(Node root) {
        if (root == null)
            return 0;

        int ans = 0;
        Queue<pair1> q = new LinkedList<>();
        q.add(new pair1(root, 0));

        while (!q.isEmpty()) {
            int size = q.size();
            int mmin = q.peek().index;
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                pair1 curr = q.poll();
                int cur_id = curr.index - mmin;
                Node node = curr.node;

                if (i == 0)
                    first = cur_id;
                if (i == size - 1)
                    last = cur_id;

                if (node.left != null)
                    q.add(new pair1(node.left, cur_id * 2 + 1));
                if (node.right != null)
                    q.add(new pair1(node.right, cur_id * 2 + 2));
            }
            ans = Math.max(ans, last - first + 1);
        }
        return ans;
    }

    // CHILDREN SUM PROPERTY IN BINARY TREE :::

    public static void change(Node root) {
        if (root == null)
            return;
        int child = 0;
        if (root.left != null)
            child += root.left.data;
        if (root.right != null)
            child += root.right.data;
        else if (child >= root.data)
            root.data = child;
        else {
            if (root.left != null)
                root.left.data = root.data;
            if (root.right != null)
                root.right.data = root.data;
        }

        change(root.left);
        change(root.right);

        int tot = 0;
        if (root.left != null)
            tot += root.left.data;
        if (root.right != null)
            tot += root.right.data;
        if (root.left != null || root.right != null)
            root.data = tot;
    }

// Nodes at distance k from the binary tree

    public static void markParents(Node root, Map <Node, Node> h1) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.left != null) {
                h1.put(current.left, current);
                queue.add(current.left);
            }

            if (current.right != null) {
                h1.put(current.right, current);
                queue.add(current.right);
            }
        }
    }

    public static Node findNode(Node root, int val) {
        if (root == null)
            return null;
        if (root.data == val)
            return root;
        Node left = findNode(root.left, val);
        if (left != null)
            return left;
        return findNode(root.right, val);
    }


    public static List<Integer> distanceK(Node root, Node target, int k) {
        Map<Node, Node> h1 = new HashMap<>();
        markParents(root, h1);

        Map <Node, Boolean> visited = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(target);
        visited.put(target, true);

        int curr_level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            if (curr_level == k)
                break; 
            curr_level++;

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();

                if (current.left != null && visited.get(current.left) == null) {
                    queue.add(current.left);
                    visited.put(current.left, true);
                }

                if (current.right != null && visited.get(current.right) == null) {
                    queue.add(current.right);
                    visited.put(current.right, true);
                }

                if (h1.get(current) != null && visited.get(h1.get(current)) == null) {
                    queue.add(h1.get(current));
                    visited.put(h1.get(current), true);
                }
            }
        }

        List <Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll().data);
        }

        return result;
    }

// Complete Nodes question :::

        public int countNodes(Node root) {
        if(root == null) return 0;
        int left = gethtleft(root);
        int right = gethtright(root);
        if(left == right) return((2 << (left)) - 1);
        else return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public int gethtleft(Node root){
        int cnt = 0;
        while(root.left != null){
            root = root.left;
            cnt++;
        }
        return cnt;
    }

    public int gethtright(Node root){
        int cnt = 0;
        while(root.right != null){
            root = root.right;
            cnt++;
        }
        return cnt;
    }

    // BUILD TREE FROM GIVEN INORDER, PREORDER OF GIVEN TREE :::

    public Node buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        return buildTree(preorder, 0, preorder.length - 1,
                         inorder, 0, inorder.length - 1,
                         inMap);
        }

    public Node buildTree(int[] preorder, int preStart, int preEnd,
                          int[] inorder, int inStart, int inEnd,
                          Map<Integer, Integer> inMap) {
        if (preStart > preEnd || inStart > inEnd) return null;
        Node root = new Node(preorder[preStart]);
        int inRoot = inMap.get(root.data);
        int numsLeft = inRoot - inStart;

        root.left = buildTree(preorder, preStart + 1, preStart + numsLeft,
                              inorder, inStart, inRoot - 1, inMap);

        root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd,
                               inorder, inRoot + 1, inEnd, inMap);

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        // ArrayList <Integer> ans = inordertrav(root);
        // System.out.println(ans);
        ArrayList<Integer> ans1 = postordertrav(root);
        System.out.println(ans1);

        System.out.println(mxheight(root));

        System.out.println(isBalanced(root));

        System.out.println(diameterOfBinaryTree(root));

        System.out.println(maxPathDown(root, new int[1]));

        ArrayList<Integer> ans = printBoundary(root);
        System.out.println(ans);

        System.out.println("Top View: " + topView(root));
        System.out.println("Bottom View: " + bottomview(root));

        List<List<Integer>> l = allRootToLeaf(root);
        System.out.println(l);

        Node lcaNode = lca(root, 2, 7);
        if (lcaNode != null) {
            System.out.println("LCA: " + lcaNode.data);
        } else {
            System.out.println("LCA not found");
        }

        System.out.println(widthOfBinaryTree(root));

        Node target = findNode(root, 5);
        List <Integer> kk = distanceK(root, target, 1);
        System.out.println(kk);

    }
}