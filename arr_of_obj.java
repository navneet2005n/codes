class student{
    int marks;
    String name;
    int age;
}
public class arr_of_obj {
    public static void main(String []args){
        student s1=new student();
        s1.age=12;
        s1.marks=56;
        s1.name="akash";
        student s2=new student();
        s2.age=23;
        s2.marks=89;
        s2.name="pandu";
        student s3=new student();
        s3.age=45;
        s3.marks=78;
        s3.name="lund";
        student students[]=new student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        // new method to print the age of the students....
            // for each loop:::(enhanced for loop)
            
        for(student stud:students){
            System.out.println(stud.age);
        }

        //  main style to print the details of the student.....

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name + ":" + students[i].marks);
        }
        }
}
