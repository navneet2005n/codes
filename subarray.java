public class subarray {
//     public static void sbarray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             for(int j=i; j<arr.length; j++){
//                 for(int k=i; k<=j; k++){
//                     System.out.print(arr[k] + " ");
//                 }
//                 System.out.println();
//             }
//         }
//     }

public static int maxsubsum(int arr[]) {
    int sum = 0;
    int maxsum = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = i; j < arr.length; j++) {
            sum = 0;     
            for (int k = i; k <= j; k++) {
                sum += arr[k];
            }
            if (sum > maxsum) {
                maxsum = sum;
            }
        }
    }
    return maxsum;
}



    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        // sbarray(arr);
        System.out.println(maxsubsum(arr));
    }
}
