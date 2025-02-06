import java.util.*;
public class collections {
    // public static void intersection2arrays(int arr1[],int arr2[]){
    //     HashSet <Integer> h1 = new HashSet<>();
    //     HashSet <Integer> h2 = new HashSet<>();
    //     for(int num:arr1){
    //         h1.add(num);
    //     }
    //     for(int num:arr2){
    //         if(h1.contains(num)){
    //             h2.add(num);
    //         }
    //     }
    //     for(int num:h2){
    //         System.out.print(num + " ");
    //     }
    //     System.out.println();
    // }


    public static int findMostFrequentElement(int arr[]) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        int maxKey = arr[0];
        int maxCount = 0;
        
        for (int num : arr) {
            if (h1.containsKey(num)) {
                h1.put(num, h1.get(num) + 1);
            } else {
                h1.put(num, 1);
            }
            if (h1.get(num) > maxCount) {
                maxCount = h1.get(num);
                maxKey = num;
            }
        }
        return maxKey;
    }

    public static void main(String args[]){
        // int arr1[]={1,2,3,5,1,4};
        // int arr2[]={1,2,4,7,8,6};
        // intersection2arrays(arr1, arr2);
        int arr[]={1,2,1,2,3,1,3,3,3};
        int mostFrequent = findMostFrequentElement(arr);
        System.out.println("Most frequent element: " + mostFrequent);
    }
}
