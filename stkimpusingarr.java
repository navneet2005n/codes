import java.util.*;
class stkimpusingarr {
    static int top = 0;                  
    static int arr[] = new int[5];       
    public static void push(int i) {
        if (top < arr.length) {
            arr[top++] = i;
        }
        else {
            System.out.println("Stack Overflow");
        }
    }

    public static void display() {
        int temp = top;
        while (temp != 0) {
            System.out.print(arr[temp - 1] + " ");
            temp--;
        }
        System.out.println();
    }

    public static int size() {
        return top;
    }

    public int peek() {
        if (top == 0) {
            return -1;
        }
        return arr[top - 1];
    }
   
    public int pop() {
        if (top == 0) {
            return -1;
        }
        int top1 = arr[top - 1];
        arr[top - 1] = 0;
        top--;
        return top1;
    }

    public boolean isFull(){
        return top == arr.length;
    }
    public static void main(String[] args) {
        stkimpusingarr s1 = new stkimpusingarr();   
        s1.push(6);
        s1.push(7);
        s1.push(4);
        s1.push(8);
        s1.push(1);
        s1.display();  
        System.out.println(s1.isFull());           
    }
}
