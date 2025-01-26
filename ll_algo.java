public class ll_algo {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static boolean iscycle(){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true; // cycle exists..
            }
        }
        return false; //cycle does not exists
    }

    public static void removecycle(){
        // check of cycle: 
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        // find meeting point
        slow = head;
        Node prev = null; //last node
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        // remove cycle:
        prev.next=null;
    }
    public static void main(String args[]){
        head=new Node(4);
        Node temp=new Node(3);
        head.next=temp;
        head.next.next=new Node (2);
        head.next.next.next=temp;
        System.out.println(iscycle());
        removecycle();
        System.out.println(iscycle());
    }
}
