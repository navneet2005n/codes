public class recursions{
    public static void decreasing(int num){
        if(num==1){
            System.out.println(num);
            return;
        }
        System.out.println( num + " ");
        decreasing(num-1);
    }

    public static void increasing(int num){
        if(num==1){
            System.out.println(num + " ");
            return;
        }
        increasing(num-1);
        System.out.println(num + " ");
    }

    public static int factorial(int num){
            if(num == 0){
                return 1;
            }
            else{
           return num * factorial(num-1);
        }
    }

    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i);
    }

    public static int sum(int num){
        if (num == 1) {
            return 1;
        }
        int sn=num+sum(num-1);
        return sn;
    }
    public static int firstoccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccurence(arr, key, i+1);
    }
    public static int lastoccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isfound=lastoccurence(arr, key, i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
    }
    public static void main(String args[]){
        int num = 8;
        decreasing(num);
        increasing(num);
        System.out.println(factorial(num));
        System.out.println(sum(num));
        int arr[]={3,4,5,6,9,5};
        // System.out.println(isSorted(arr, num));
        System.out.println(firstoccurence(arr, 5, 0));
        System.out.println(lastoccurence(arr, 5, 0));
    }
}



