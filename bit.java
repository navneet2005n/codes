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


