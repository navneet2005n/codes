public class linkedlist_recursion {
        private Node head;
        private int size;
        private static class Node {
            int val;
            Node next;
            Node(int val) {
                this.val = val;
            }
            Node(int val, Node next) {
                this.val = val;
                this.next = next;
            }
        }

        public void insertrec(int val, int index) {
            head = insertrec(val, index, head);
        }
        private Node insertrec(int val, int index, Node node) {
            if (index == 0) {
                Node temp = new Node(val, node);
                size++;
                return temp;
            }
            node.next = insertrec(val, index - 1, node.next);
            return node;
        }

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            linkedlist_recursion list = new linkedlist_recursion();
            list.insertrec(10, 0);
            list.insertrec(20, 1);
            list.insertrec(30, 2);
            list.insertrec(15, 2); 
            list.printList(); 
        }
    }

