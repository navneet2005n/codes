// import java.util.Scanner;
// public class array2 {
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the length of array: ");
//         int length = sc.nextInt();
//         int arr[]=new int[length];
//         int arr1[]=new int[length+1];
//         System.out.println("Enter the elements of array: ");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Your Array is: ");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
        // }

        // Insert element at first :: 

        // System.out.println();
        // System.out.println("Enter the element u want to add at first: ");
        // int el=sc.nextInt();
        // arr1[0]=el;
        // for(int i=1;i<arr1.length;i++){
        //     arr1[i]=arr[i-1];
        // }
        // for(int i=0;i<arr1.length;i++){
        //     System.out.print(arr1[i]+" ");
        // }
        
        // insert element at middle ::

        // int start=0;
        // int end=arr1.length-1;
        // int mid=start+(end-start)/2;
        // System.out.println();
        // System.out.println("Enter the element u want to insert at mid: ");
        // int el=sc.nextInt();
        // for(int i=arr1.length-1;i>mid;i--){
        //     arr1[i]=arr[i-1];
        // }
        // arr1[mid] = el;
        // for(int i=0;i<mid;i++){
        //     arr1[i]=arr[i];
        // }
        // for(int i=0;i<arr1.length;i++){
        //     System.out.print(arr1[i]+" ");
        // }

        // Insert element at last ::

        // System.out.println();
        // System.out.println("Enter the element u want to insert at end: ");
        // int el=sc.nextInt();
        // for(int i=0;i<arr.length;i++){
        //     arr1[i]=arr[i];
        // }
        // arr1[end]=el;
        // for(int i=0;i<arr1.length;i++){
        //     System.out.print(arr1[i]+" ");
        // }
//     }
// }

                // spiral code

// public static void spiral(int matrix[][]) {
//         int startrow = 0;
//         int startcol = 0;
//         int endcol = matrix[0].length - 1;
//         int endrow = matrix.length - 1;
        
//         while (startrow <= endrow && startcol <= endcol) {
//             // Traverse from left to right
//             for (int j = startcol; j <= endcol; j++) {
//                 System.out.print(matrix[startrow][j] + " ");
//             }
//             startrow++; // Move row start up
    
//             // Traverse down the rightmost column
//             for (int i = startrow; i <= endrow; i++) {
//                 System.out.print(matrix[i][endcol] + " ");
//             }
//             endcol--; // Move column end left
    
//             // Check if a row remains before printing from right to left
//             if (startrow <= endrow) {
//                 for (int j = endcol; j >= startcol; j--) {
//                     System.out.print(matrix[endrow][j] + " ");
//                 }
//                 endrow--; // Move row end up
//             }
    
//             // Check if a column remains before printing from bottom to top
//             if (startcol <= endcol) {
//                 for (int i = endrow; i >= startrow; i--) {
//                     System.out.print(matrix[i][startcol] + " ");
//                 }
//                 startcol++; // Move column start right
//             }
//         }
//     }
    



