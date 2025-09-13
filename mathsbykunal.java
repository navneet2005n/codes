public class mathsbykunal {
    public static int lcm(int a, int b){
        return a*b/gcd(a, b);
    }
    public static int gcd(int a, int b){
    while(b!=0){
        int temp = b;
        b = a%b;
        a = temp;
    }      
    return a;  
    }

    public static int sqrt(int a){
        int l = 0, r = a;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(mid*mid == a){
                 return mid;
            }
            else if(mid*mid < a) {
                l = mid+1;
            }
            else r = mid-1;
        }
        return r;
    }

    public static void main(String args[]){
        System.out.println(lcm(4, 6));
        System.out.println(gcd(4, 6));
        System.out.println(sqrt(16));
    }


}
