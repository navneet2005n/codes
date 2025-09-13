import java.util.Scanner;
public class bit {
    public static void bit(int num){
        int result;
        result = num & 1;
        if(result == 1){
           System.out.println("Number is odd");
        }
        else{
            System.out.println("Number is even"); 
        }
    } 

    public static int getbit(int num,int i){
        int bitmask =  1<<i;
        if((num & bitmask) == 0){
            return 0;
        }
        else{
        return 1;
    }
}

    public static int setbit(int num,int i){
        int bitmask = 1<<i;
        return num | bitmask;
    }

    public static int clearbit(int num,int i){
        int bitmask = i<<1;
        return num & (~bitmask);
    }

    public static int updatebit(int num,int i,int newbit){
        num = clearbit(num, i);
        int bitmask = newbit<<i;
        return num | bitmask;
    }

    public static int clribits(int num, int i){
        int bitmask = -1<<i; // or ~0<<i;
        return num & bitmask;
    }

    public static int cntsetbits(int num){
        int cnt = 0;
        while(num!=0){
            if((num & 1)== 1){
                cnt++;
            }
           num = num >> 1;
        }
        return cnt;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        bit(num);
        // System.out.println(getbit(num, 1));
        // System.out.println(setbit(num, 2));
        // System.out.println(clearbit(num, 1));
        // System.out.println(updatebit(10, 2, 1));
        System.out.println(clribits(num, 2));
        System.out.println(cntsetbits(num));
    }
}

//                                      ithbit of a number :::

// public class Main
// {
//     public static int ithbit(int n,int cnt){
//         int i = 0;
//         while(i != cnt-1){
//            n =  n >> 1;
//             i++;
//         }
//         return (n&1);
//     }

//  public static int ithbit2(int n,int cnt){
//     n = n & (1 << (cnt-1));
//     return (n != 0) ? 1 : 0;
// }

                    //        Set ithbit of a number :::

// public static int setithbit(int n, int cnt) {
//     return n ^ (1 << (cnt - 1));
// }

// 	public static void main(String[] args) {
//     int a = 14;
//     int cnt  = 1;
//     System.out.print(ithbit(a,cnt));
//     System.out.print(ithbit2(a,cnt));
//     System.out.println();
//     a = setithbit(a,cnt);
//     System.out.print(ithbit2(a,cnt));
// 	}
// }


                        // Full code of kunal video 
                        
// public class Main
// {
//     public static int ithbit(int n,int cnt){
//         int i = 0;
//         while(i != cnt-1){
//           n =  n >> 1;
//             i++;
//         }
//         return (n&1);
//     }
    
//     public static int ithbit2(int n,int cnt){
//         n = n & (1 << (cnt-1));
//         return (n != 0) ? 1 : 0;
//     }
    
//     public static int setithbit1(int n, int cnt) {
//             return n | (1 << (cnt - 1));
//     }
    
//      public static int setithbit0(int n, int cnt) {
//             return n &~ (1 << (cnt - 1));
//     }
    
    
//     public static int setithbit(int n, int cnt) {
//             return n ^ (1 << (cnt - 1));
//     }
    
// 	public static void main(String[] args) {
//     int a = 4;
//     int b = 6;
//     int c = 7;
//     int cnt = 3;
//     // System.out.print(ithbit(a,cnt));
//     // System.out.println();
//     // // setithbit(a,cnt);
//     // System.out.print(ithbit(a,cnt));
//     System.out.print(ithbit2(a,cnt));
//     System.out.println();
//     a = setithbit1(a,cnt);
//     System.out.print(ithbit2(a,cnt));
//     System.out.println();
//     b = setithbit0(b,cnt);
//     System.out.print(ithbit2(b,cnt));
//     System.out.println();
//     c = setithbit(c,cnt);
//     System.out.print(ithbit2(c,cnt));

// 	}
// }
