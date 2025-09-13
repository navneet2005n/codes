import java.util.LinkedList;
import java.util.Queue;
public class queue_imp_arr {
        public static class queuea{
        int f = -1;
        int r = -1;
        int size = 0;
        int arr[] = new int[5];
         
        public void add(int n){
            if(r == arr.length-1){
                System.out.print("Queue is full");
                return;
            }
           if(f == -1){
            f = r = 0;
            arr[0] = n;
           } 
           else{
              arr[++r] = n;  
            }
            size++;
        }
         
        public int remove(){
            if(size == 0){
                System.out.print("queue is empty..");
                return -1;
            }
            size--;
            f++;
            return arr[f-1];
        }
        
        public int peek(){
            if(f == -1){
                System.out.print("queue is empty..");
                return -1;
            }
            return arr[f];
        }
        
        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty..");
            }
            for(int i=f; i<=r; i++){
                 System.out.print(arr[i]+" ");
            }
        }
    }
    
    public static void printq(Queue <Integer> q){
        while(q.size() != 0){
            System.out.print(q.remove() + " ");
        }
    }
    
    public static void printq22(Queue <Integer> q){
        Queue<Integer> q1 = new LinkedList<>();
        while(q.size() != 0){
            q1.add(q.remove());
        }
        while(q1.size()!=0){
            System.out.print(q1.remove() + " ");
        }
    }
    
	public static void main(String[] args) {
        // Queue <Integer> q1 = new LinkedList<>();
        // q1.add(3);
        // q1.add(4);
        // q1.add(8);
        // q1.add(0);
        // printq22(q1);
        queuea q1 = new queuea();
        q1.add(4);
        q1.add(1);
        q1.add(3);
        q1.add(8);
        q1.display();
        q1.remove();
        System.out.println();
        q1.display();
        System.out.println();
        System.out.println(q1.peek());
        System.out.println(q1.size);
        
        // q1.printq();
	}

}
