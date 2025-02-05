import java.util.*;
public class PrimeNumber {
    public static boolean chkprime(int n) {
        if (n < 2) return false; 
        for (int i = 2; i * i <= n; i++) { 
            if (n % i == 0) {
                return false; 
            }
        }
        return true;
    }
    public static void inrange(int n1, int n2) {
        for (int i = n1 + 1; i < n2; i++) { 
            if (chkprime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower range: ");
        int n1 = sc.nextInt();
        System.out.print("Enter upper range: ");
        int n2 = sc.nextInt();
        sc.close();
        System.out.println("Prime numbers between " + n1 + " and " + n2 + ":");
        inrange(n1, n2);
    }
}


