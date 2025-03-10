import java.util.*;
public class bitwisekunal {
//     public static int posRightmost(int n, int cnt) {
//         if ((n & 1) == 1) {
//             return cnt; 
//         }
//         return posRightmost(n >> 1, cnt + 1); 
//     }
    
//         return sum + nthMagicalNo(n >> 1, cnt + 1); 

    
//     public static int cntdiginbin(int n,int cnt){
//         if(n == 0){
//             return cnt;
//         }
//         return cntdiginbin(n >> 1,cnt+1);
//     }
    
//     public static int pascalrowsum(int n){
//         return (int) Math.pow(2, n-1);
//     }
    
//     public static boolean powof2(int n,int cnt){
//         // first method :
        
//         if(n == 0){
//             return cnt == 1;
//         }
//         if((n & 1) == 1){
//             cnt++;
//         }
//         return powof2(n>>1,cnt);
        
//         // second method ::
        
//         // while(n % 2 == 0)  n = n/2 ;
//         // return n == 1;
//     }
    
//   public static int pow(int a, int b) {
//         int prod = 1;
//         while (b > 0) {
//              if ((b & 1) == 1) {
//                  prod*= a;
//              }
//              a *= a;
//              b = b >> 1;
//         }
//       return prod;
//     }
    
//     public static int setbits(int n,int cnt){
//         if(n == 0){
//             return cnt;
//         }
//         if((n & 1) == 1){
//             cnt++;
//         }
//         return setbits(n>>1 , cnt);
//     }
    
    // public static int xor(int a){
    //     int xor = 0; 
    //     for(int i=1;i<=a;i++){
    //         xor^= i;
    //     }
    //     return xor;
    // }
    
    public static void main(String[] args) {
        // System.out.print(posRightmost(4, 1)); 
        //     System.out.print(nthMagicalNo(5,1));
        //     System.out.println();
        //     System.out.print(cntdiginbin(8,0));
        //     System.out.println();
        //     System.out.print(pascalrowsum(4));
        //     System.out.println();
        //     System.out.print(powof2(5));
        //     System.out.println();
        //     System.out.print(powof2(9,0));
        //     System.out.println();
        //     System.out.print(pow(2,7));
        //     System.out.println();
        //     System.out.print(setbits(13,0));
            // System.out.println();
            // System.out.print(xor(8));
    }
}