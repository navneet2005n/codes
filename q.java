import java.util.*;
public class q {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<String>();
        int choice = 1;
        String name;
        Scanner sc = new Scanner(System.in);
        li.add("Uttrakhand");
        li.add("Punjab");
        li.add("himachal");
        li.add("shimla");

        while (choice != 5) {
            System.out.println("1 - Add Element");
            System.out.println("2 - Size of Linked List");
            System.out.println("3 - Sort Linked List");
            System.out.println("4 - Search Linked List");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            if (choice == 1) {
                System.out.println("Enter the element to be added");
                name = sc.nextLine();
                li.add(name);
                System.out.println(li);
            } 
            else if (choice == 2) {
                System.out.println("Linked List contains " + li.size() + " items");
                System.out.println(li);
            } 
            else if (choice == 3) {
                li.sort(null);
                System.out.println(li);
            } 
            else if (choice == 4) {
                System.out.println("Enter the element to be searched");
                name = sc.nextLine();
                if (li.contains(name)) {
                    System.out.println("Element is present in the linked list");
                } else {
                    System.out.println("Element is not present in the linked list");
                }
            }
        }
    }
}