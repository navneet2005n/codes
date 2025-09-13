public class queue_imp_ll {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    
    public static class queuell{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int n){
            Node temp = new Node(n);
            if(size == 0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        
        public  int remove(){
            if(size == 0){
                System.out.print("Queue is empty..");
                return -1;
            }
                size--;
                int x = head.data;
                head = head.next;
                return x;
        }
        
        public  int peek(){
             if(size == 0){
                System.out.print("Queue is empty..");
                return -1;
            }
            return head.data;
        }
        
        public  void display(){
           if(size == 0){
                System.out.print("Queue is empty..");
                return;
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // Queue <Integer> q1 = new LinkedList<>();
        // q1.add(3);
        // q1.add(4);
        // q1.add(8);
        // q1.add(0);
        // printq22(q1);
        // queuea q1 = new queuea();
        // q1.add(4);
        // q1.add(1);
        // q1.add(3);
        // q1.add(8);
        // q1.display();
        // q1.remove();
        // System.out.println();
        // q1.display();
        // System.out.println();
        // System.out.println(q1.peek());
        // System.out.println(q1.size);
        // q1.printq();
        queuell n1 = new queuell();
        n1.display();
        System.out.println();
        n1.add(1);
        n1.add(2);
        n1.add(3);
        n1.add(4);
        n1.display();
        System.out.println(n1.peek());
        System.out.println(n1.remove());
        System.out.println(n1.size);
        n1.display();        
	}
}
