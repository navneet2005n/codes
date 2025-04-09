import java.util.Scanner;
import java.util.Stack;
public class deleteinstkusingindex {
    public static void main(String[] args) {
        Stack <Integer> s1 = new Stack<>();
        Stack <Integer> s2 = new Stack<>();
        Stack <Integer> s3 = new Stack<>();
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        int cnt = 0;
        System.out.println(s1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of stack that u want to delete: ");
        int n1 = sc.nextInt();
        while(s1.size() > 0){
            s2.push(s1.pop());
        }
        
        while(s2.size() > 0){
            if(cnt == n1){
                s2.pop();
                break;
            }
            s1.push(s2.pop());
            cnt++;
        }
        System.out.println(s1);
	}
}
