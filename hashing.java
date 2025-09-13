public class hashing {
    public static int freq(int arr[],int n){
        int hasharr[] = new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            hasharr[arr[i]]++;
        }
        return hasharr[n];
    }
    public static int freq(String s,char c){
        int hasharr[] = new int[256];
        for(int i=0;i<s.length();i++){
            hasharr[s.charAt(i)]++;
        }
        return hasharr[c];
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 3, 5, 2};
        int n = 4;
        System.out.println(freq(arr,n));
        String s = "hello";
        char c = 'l';   
        System.out.println(freq(s,c));
    }
}
