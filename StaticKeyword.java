public class StaticKeyword {
    // static keyword in java is used to share the same variable or method of a given class 
    // 1) Properties 
    // 2) functions
    // 3) blocks 
    // 4) nested loops
    public static void main(String args[]) {
        ssstudent s1 = new ssstudent();
        s1.school_name = "JMV";
        // as school_name is static so it is fixed for every object....
        ssstudent s2 = new ssstudent();
        ssstudent s3 = new ssstudent();
        // In student s3, the school_name is changed in the memory so all student schoolnames 
        // points to same memory addresss ....
        s3.school_name = "jkl";
        System.out.println(s2.school_name); 
       System.out.println(s2.getpercentage(23, 56, 67));
    }
}

class ssstudent {
    String name;
    int age;
    static String school_name;
    // school_name is fixeed as static for every object....
    static int getpercentage(int chem,int phy,int maths){
        return (chem+phy+maths)/3;
    }
    void setName(String name) {
        this.name = name;
    }
    void setAge(int age) {
        this.age = age;
    }
}