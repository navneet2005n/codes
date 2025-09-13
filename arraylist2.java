import java.util.ArrayList;
import java.util.Collections;
public class arraylist2 {
    public static int max(ArrayList<Integer> l1) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < l1.size(); i++) {
            if (max < l1.get(i)) {
                max = l1.get(i);
            }
        }
        return max;
    }
    
    public static void swap(ArrayList<Integer>l1,int index1,int index2){
        for(int i=0;i<l1.size();i++){
            int temp = l1.get(index1);
            l1.set(index1,l1.get(index2));
            l1.set(index2,temp);
        }
    }
    public static void main(String args[]) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(5);
        l1.add(1);
        // for(int i = l1.size()-1; i>=0 ; i--){
        //     System.out.print(l1.get(i)+" ");
        // }
        System.out.println(l1);
        // System.out.println(max(l1)); 
        swap(l1, 2, 3);
        System.out.println(l1);

        // Sorting of Arraylist :::
        
        Collections.sort(l1);
        System.out.println(l1);


        // Descending order
        // comparator function : here it is reverseOrder() function 

        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);
    }
}


