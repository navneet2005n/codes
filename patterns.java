public class patterns {
    public static void patt1(int n){
        for(int i = n; i >= 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void patt2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("* ");
            patt2(r, c + 1);
        } else {
            System.out.println();
            patt2(r - 1, 0);  
        }
    }
    public static void main(String args[]){
        // patt1(5);
        int n = 5;
        patt2(n,0);
    }
}

