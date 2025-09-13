import java.util.*;
public class hashset {
    public static void main(String args[]){
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(10);
        hs.add(20); 
        hs.add(30);
        hs.add(40);
        hs.add(50);
        System.out.println(hs.contains(20)); 
        System.out.println(hs);
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
