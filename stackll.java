import java.util.Stack;
                           
                            // using linkedlist :::

public class stackll {
    class StackUsingLL {
        static class Node {
            int data;
            Node next;
            Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;  
            }
            int topData = head.data;
            head = head.next;
            return topData;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }
    
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        while (!stack.isEmpty()) {
            System.out.println(stack.peek()); 
            stack.pop(); 
        }
    }
}
