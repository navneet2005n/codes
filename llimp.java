import java.util.*;
public class llimp{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    
    public static class llstack{ // user defined data structure..
        Node head = null;
        int size = 0;
        
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        
        void revdisplay(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        
        void displayrec(Node head){
            if(head == null){
                return;
            }
            displayrec(head.next);
            System.out.print(head.val + " ");
        }

        void display(){
            displayrec(head);
            System.out.println();
        }

        int size(){
            return size;
        }
        
        int pop(){
            if(head == null){
                System.out.print("stack is empty");
            }
            int top = head.val;
            head = head.next;
            return top;
        }
        
        int peek(){
            if(head == null){
                System.out.print("stack is empty");
            }
            return head.val;
        }
        
        boolean isempty(){
            return size == 0;
        }
    }
    public static void main(String args[]){
        llstack st = new llstack();
        st.push(1);
        st.push(2);
        st.display();
        st.push(5);
        st.push(3);
        st.push(4);
        st.display();
        st.revdisplay();
        System.out.println(st.isempty());
    }
}