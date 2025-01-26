import java.util.Scanner;
public class avg {
    public static void avg_marks(int marks[]){
        int sum=0;
        int cnt=0;
        int cnt1=0;
        int e=0;
        int avg=0;
        for(int i=0;i<marks.length;i++){
            sum += marks[i];
            cnt++;
        }
        avg=sum/cnt;
        System.out.println("Average: " + avg);
        for(int i=0;i<marks.length;i++){
            if(marks[i]>avg){
                cnt1++;
            }
        }
        int higheravg_marks[]=new int[cnt1];
        for(int i=0;i<marks.length;i++){
            if(marks[i]>avg){
            higheravg_marks[e] = marks[i];
            e++;
            }
        }
        for(int i=0;i<higheravg_marks.length;i++){
            System.out.print(higheravg_marks[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int len=sc.nextInt();
        int marks[] = new int[len];
        System.out.println("Enter the marks of students: ");
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        avg_marks(marks);
    }
}

