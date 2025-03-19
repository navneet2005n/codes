public class linkedlist {
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
    static int size=0;
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print all nodes in the linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");  
            temp = temp.next;
        }
        System.out.println("null"); 
    }

    public void add(int index,int data){
        Node newNode= new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while (i<index-1) {
            temp=temp.next;
            i++;
        }
        // i=idx-1; temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removefirst(){
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        head=head.next;
        int val=head.data;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 1){
            int val=head.data;
            head=head.next;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0; i<size-2 ;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrsrch(int key){
        Node temp = head;
        int i=0;
        while (temp != null) {
            if(temp.data == key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

                                // REVERSE THE LINKEDLIST ::::

    // public void reverse() {
    //     Node prev = null;
    //     Node curr = head; // Initialize curr and set tail to head
    //     Node next = null;
    //     while (curr != null) {
    //         next = curr.next; // Save reference to next node
    //         curr.next = prev; // Reverse the link
    //         prev = curr;      // Move prev to current
    //         curr = next;      // Move curr to next
    //     }
    //     head = prev; // Update head to new front
    // }

    // Check the given ll is palindrome :
    // 1) find midnode
    // 2) 2nd half reverse
    // 3) check if 1st half(left) == 2nd half(right).

    // slow fast approach:

    // public Node findmid(Node head) {
    //     Node slow = head;
    //     Node fast = head;
    //     while (fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     return slow;
    // }

    // public boolean checkpalindrome() {
    //     if (head == null || head.next == null) {
    //         return true;
    //     }

    //     // Step 1: Find the middle node
    //     Node midnode = findmid(head);

    //     // Step 2: Reverse the second half of the list

    //     Node prev = null;
    //     Node curr = midnode;
    //     Node next = null;
    //     while (curr != null) {
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }

    //     Node right = prev; // Start of the reversed half
    //     Node left = head;  // Start of the first half

    //     // Step 3: Compare the left half and the reversed right half
    //     while (right != null) {
    //         if (left.data != right.data) {
    //             return false;
    //         }
    //         left = left.next;
    //         right = right.next;
    //     }
    //     return true;
    // }

    // public Node findmid(Node head){
    //     Node slow = head;
    //     Node fast = head;
    //     while(fast != null && fast.next!=null){
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     return slow;
    // }
    
    // public boolean checkpalindrome(){
    //     if(head == null && head.next == null){
    //         return true;
    //     }
    //     Node mid_el = findmid(head);
    //     Node next = null;
    //     Node curr = mid_el;
    //     Node prev = null;
    //     while(curr != null){
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     Node right = prev;
    //     Node left = head;
    //     while( right != null){
    //         if( left.data != right.data){
    //             return false;
    //         }
    //         left = left.next;
    //         right = right.next;
    //     }
    //     return true;
    // }

    // floyd cyclecheck algorithm ::

    // public boolean iscycle(){
    //     Node slow=head;
    //     Node fast=head;
    //     while (fast!=null && fast.next!=null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //         if(slow == fast){
    //             return true; // cycle exists..
    //         }
    //     }
    //     return false; //cycle does not exists
    // }

    // public void removecycle(){
    //     // check of cycle: 
    //     Node slow=head;
    //     Node fast=head;
    //     boolean cycle=false;
    //     while(fast!=null && fast.next!=null){
    //         slow=slow.next;
    //         fast=fast.next.next;
    //         if(fast==slow){
    //             cycle=true;
    //             break;
    //         }
    //     }
    //     if(cycle==false){
    //         return;
    //     }
    //     // find meeting point
    //     slow = head;
    //     Node prev = null; //last node
    //     while(slow != fast){
    //         prev = fast;
    //         slow = slow.next;
    //         fast = fast.next;
    //     }
    //     // remove cycle:
    //     prev.next = null;
    // }

    public static Node addele(Node head,int k,Node element){
        Node temp=head;
        Node prev=null;
        if(k<=0){
            System.out.println("Invalid position..");
            return head;
        }
        if (k==1) {
            element.next=head;
            return head;
        }
        int cnt=0;
        while(temp!=null){
            cnt++;
            if(cnt==k){
                prev.next=element;
                element.next=temp;
                return head;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }


    public static Node insertbefore(Node head,Node element,Node x){
        Node temp=head;
        Node prev=null;
        if(head == null){
            return head;
        }
        if(head==x){
            element.next=x;
        }
        while(temp!=null){
            if(temp == x){
                prev.next=element;
                element.next=x;
                return head;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // linkedlist ll = new linkedlist();
        linkedlist ll2 = new linkedlist();
        // ll.print();
        // ll.addFirst(2);
        // ll.print();  // Output: 2
        // ll.addFirst(9);
        // ll.print();  // Output: 9 2
        // ll.addLast(6);
        // ll.print();  // Output: 9 2 6
        // ll.addLast(5);
        // ll.add(3,2);
        // ll.print();
        ll2.addFirst(2);
        ll2.addFirst(1);
        ll2.addLast(2);
        ll2.addLast(1);
        ll2.print();
        // ll.print();  // Output: 9 2 6 2 5 null
        // System.out.println(ll.size);
        // ll.removefirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.itrsrch(6));
        // ll.reverse();
        // ll.print();
        // System.out.println(ll2.checkpalindrome());
        // System.out.println(ll2.iscycle());
        Node newNode = new Node(6); // Create a new Node with value 5
        Node newNode1 = new Node(7); // Create a new Node with value 5
        System.out.println(addele(ll2.head,4,newNode));
        ll2.print();
        System.out.println(insertbefore(ll2.head, newNode1,newNode));
        ll2.print();
    }
}


//              CountNodesinLoop testpad question :

// class Result {
//     static int loopInList(Node head) {
//         if (head == null) return 0;  
//         Node slow = head;
//         Node fast = head;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if (slow == fast) { 
//                 return countloopnodes(slow);
//             }
//         }
//         return 0;
//     }
//     static int countloopnodes(Node meetingPoint) {
//         Node temp = meetingPoint;
//         int count = 1;
//         while (temp.next != meetingPoint) {
//             count++;
//             temp = temp.next;
//         }
//         return count;
//     }
// }

    //  Insert in a sorted circular linked list ::::::

// class Result {
//     static LinkList insertSorted(LinkList head, int data) {
//     LinkList newNode = new LinkList(data);
//      if (head == null) {
//         newNode.next = newNode; 
//         return newNode;
//       }
//       LinkList curr = head;
//        if (data < head.data) {
//         while (curr.next != head) {
//           curr = curr.next;
//         }
//         curr.next = newNode;
//         newNode.next = head;
//         return newNode;  
//       }
//       while (curr.next != head && curr.next.data < data) {
//         curr = curr.next;
//       }
//       newNode.next = curr.next;
//       curr.next = newNode;
//       return head;  
//     }
//   }

                        // Remove Nth node from end of list ::::::

// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         int len = 0;
//         ListNode temp = head;
//         while (temp != null) {
//             len++;
//             temp = temp.next;
//         }
//         if (len == n) {
//             return head.next;
//         }
//         int i = 0;
//         temp = head;
//         int index = len - n - 1; 
//         while(i < index) {
//             i++;
//             temp = temp.next;
//         }
//         temp.next = temp.next.next;
//         return head;
//     }
// }


                            // Delete in a Doubly Linked List :::::::

 //     public Node deleteNode(Node head, int x) {
    //         if(head == null){
 //             return null;
  //         }
//         if(x == 1){
//            head = head.next;
//             if (head != null) {
//                 head.prev = null;
                            //             }
                            //             return head;
                            //         }
                                    
                            //         Node prev = null;
                            //         int i = 1;
                            //         Node temp = head;
                            //         while(i < x){
                            //             prev = temp;
                            //             temp = temp.next;   
                            //             i++;
                            //         }
                            //         prev.next = temp.next;
                            //          if (temp.next != null) {
                            //             temp.next.prev = prev;
                            //         }
                            //         return head;
                            //     }
                            // }
                


                           
            //  Delete all occurrences of a given key in a doubly linked list ::::::


// class Solution {
//     static Node deleteAllOccurOfX(Node head, int x) {
//         if (head == null) return null; 
//         Node temp = head;
//         while (head != null && head.data == x) {
//             head = head.next;
//             if (head != null) {
//                 head.prev = null; 
//             }
//         }
//         temp = head;
//         Node tem = null;
//         while (temp != null) {
//             tem = temp;
//             temp = temp.next;
//             if (temp != null && temp.data == x) { 
//                 tem.next = temp.next;  
//                 if (temp.next != null) {
//                     temp.next.prev = tem;
//                 }
//                 temp = tem; 
//             }
//     }
//     return head;
// }
// }

//                      (3) ADD TWO NUMBERS IN A LINKED LIST ::::::


//  class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode dummy = new ListNode(0);
//         ListNode current = dummy;
//         int carry = 0;
//         while (l1 != null || l2 != null || carry > 0) {
//             int val1 = (l1 != null) ? l1.val : 0;
//             int val2 = (l2 != null) ? l2.val : 0;
//             int sum = val1 + val2 + carry;
//             carry = sum / 10;
//             current.next = new ListNode(sum % 10); 
//             current = current.next;
//             if (l1 != null) l1 = l1.next;
//             if (l2 != null) l2 = l2.next;
//         }
//         return dummy.next;
//     }
// }

//                      (4) MERGE TWO SORTED LINKED LISTS ::::::

// class Solution {
//     public ListNode mergeKLists(ListNode[] lists) {
//         if (lists == null || lists.length == 0) {
//             return null;
//         }
//         int cnt = 0;
//         for (ListNode node : lists) {
//             ListNode temp = node;
//             while (temp != null) {
//                 cnt++;
//                 temp = temp.next;
//             }
//         }
//         if (cnt == 0) {
//             return null;
//         }
//         int[] arr = new int[cnt];
//         int i = 0;
//         for (ListNode node : lists) {
//             ListNode temp = node;
//             while (temp != null) {
//                 arr[i++] = temp.val;
//                 temp = temp.next;
//             }
//         }
//         Arrays.sort(arr);
//         ListNode dummy = new ListNode(0);
//         ListNode curr = dummy;
//         for (int n : arr) {
//             curr.next = new ListNode(n);
//             curr = curr.next;
//         }
//         return dummy.next;
//     }
// }

//                     (5)    Remove Nodes From Linked List


// class Solution {
//     public ListNode removeNodes(ListNode head) {
//         ListNode temp = head;
//         int cnt = 0;
//         int i = 0;
//         while (temp != null) {
//             cnt++;
//             temp = temp.next;
//         }        
//         int arr[] = new int[cnt];
//         temp = head;
//         while (temp != null) {
//             arr[i++] = temp.val;
//             temp = temp.next;
//         }
//         int c = 0;
//          for (int f = 0; f < arr.length; f++) {  
//             boolean flag = true;
//             for (int j = f + 1; j < arr.length; j++) {
//                 if (arr[f] < arr[j]) {
//                     flag = false;
//                     break;
//                 }
//             }
//             if (flag) {
//                 c++;
//             }
//         }
//         int arr2[] = new int[c];
//         int index = 0; 
//         for (int g = 0; g < arr.length; g++) { 
//             boolean flag = true;
//             for (int k = g + 1; k < arr.length; k++) {
//                 if (arr[g] < arr[k]) {
//                     flag = false;
//                     break;
//                 }
//             }
//             if (flag) {
//                 arr2[index++] = arr[g]; 
//             }
//         }
//         ListNode dummy = new ListNode(0);
//         ListNode curr = dummy;
//         for (int num : arr2) {
//             curr.next = new ListNode(num);
//             curr = curr.next;
//         }
//         return dummy.next;
//     }
// }

//                      (6)    Remove Duplicates from Sorted LinkedList ::::::    

// class Solution {
//     Node removeDuplicates(Node head) {
//         if (head == null) return null;
//         HashSet<Integer> seen = new HashSet<>();
//         Node curr = head;
//         Node prev = null;
//         while (curr != null) {
//             if (seen.contains(curr.data)) {
//                 // Remove duplicate
//                 prev.next = curr.next;
//             } 
//              else {
//                 seen.add(curr.data);
//                 prev = curr;
//             }
//             curr = curr.next;
//         }
//         return head;
//     }
// }


// (TESTPAD QUESTION)

          // Move the min of ll to head and max of ll to tail ::::: 

                    // static Node shiftSmallLarge(Node head) {
                    //     if (head == null || head.next == null) return head; 
                    //     Node temp = head;
                    //     int cnt = 0;
                    //     while (temp != null) {
                    //         cnt++;
                    //         temp = temp.next;
                    //     }
                    //     int arr[] = new int[cnt];
                    //     temp = head;
                    //     int k = 0;
                    //     while (temp != null) {
                    //         arr[k++] =  temp.data;
                    //         temp = temp.next;
                    //     }
                    //     int max = arr[0], min = arr[0];
                    //     for (int i = 1; i < arr.length; i++) {
                    //         if (arr[i] > max) 
                    //         {
                    //             max = arr[i];
                    //         }
                    //         if (arr[i] < min) 
                    //         {
                    //             min = arr[i];
                    //         }
                    //     }
                    //     int arr2[] = new int[cnt];
                    //     arr2[0] = min;
                    //     arr2[arr2.length - 1] = max;
                    //     int j = 1; 
                    //     for (int i = 0; i < arr.length; i++) {
                    //         if (arr[i] != min && arr[i] != max) {
                    //             arr2[j++] = arr[i];
                    //         }
                    //     }
                    //     Node dummy = new Node(0);
                    //     Node curr = dummy;
                    //     for (int num : arr2) {
                    //         curr.next = new Node(num);
                    //         curr = curr.next;
                    //     }
                    //     return dummy.next; 
                    // }                 