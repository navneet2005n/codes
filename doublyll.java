public class doublyll {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public static Node head;
public static Node tail;
public static int size;

//    addfirst method  :::

public void addfirst(int data){
    Node newnode = new Node(data);
    size++;
    if (head==null) {
        head=tail=newnode;
        return;
    }
    newnode.next = head;
    head.prev=newnode;
    head=newnode;
}

// print method :

public void print(){
    Node temp =head;
    while(temp!=null){
        System.out.print(temp.data+"<->");
        temp=temp.next;
    }
    System.out.println("null");
}

// removefirst method :

public int removefirst(){
    if (head==null) {
        System.out.println("Dll is empty. ");
        return Integer.MIN_VALUE;
    }
    if(size==1){
        int val=head.data; 
        head=tail=null;
        size--;
        return val;
    }
    int val=head.data;
    head=head.next;
    head.prev=null;
    size--;
    return val;
}

// addlast method :

public void addLast(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) { 
        head = tail = newNode;
    } else {
        tail.next = newNode;  
        newNode.prev = tail; 
        tail = newNode;    
    }
}

// removelast method:

    public void removeLast() {
        if (head == null) {
            System.out.println("The list is empty. Nothing to remove.");
            return;
    }
    size--; 
    if (head == tail) { 
        head = tail = null;
    } else {
        tail = tail.prev;
        tail.next = null; 
    }
}
// reverse method::

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String args[]){
        doublyll dll=new doublyll();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        dll.print();
        System.out.println(dll.size);
        dll.removefirst();
        dll.print();
        System.out.println(dll.size);
        dll.addLast(6);
        dll.print();
        dll.removeLast();
        dll.print();
        dll.addfirst(1);
        dll.print();
        dll.reverse();
        dll.print();
    }
}
