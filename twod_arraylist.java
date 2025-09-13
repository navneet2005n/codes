import java.util.*;
public class twod_arraylist {
    public static void Al(){
        ArrayList <ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList <Integer> l1 = new ArrayList<>();
        l1.add(1); l1.add(2); l1.add(3); l1.add(4); l1.add(5);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(2); l2.add(4); l2.add(6); l2.add(8); l2.add(10);
        ArrayList <Integer> l3 = new ArrayList<>();
        l3.add(3); l3.add(6); l3.add(9); l3.add(12); l3.add(15);
        mainlist.add(l1);
        mainlist.add(l2);
        mainlist.add(l3);
        System.out.println(mainlist);
    }
    public static void main(String args[]){
        Al();
    }
}
