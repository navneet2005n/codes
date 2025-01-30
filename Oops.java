// Encapsulation is the process of wrapping different properties and methods in a single unit.
// It is also used for implementing data hiding (e.g., making data private to restrict access outside the class).

// Constructors are special methods that are invoked automatically when an object is created.
// Properties of constructors:
// 1) They have the same name as the class.
// 2) They have no return type (not even void).
// 3) They are called only once at object creation.
// 4) Memory allocation happens when a constructor is called.

class Student {
    int roll;
    String name;
    int marks[];
    String password;
    // Default Constructor
    Student(){  // non parameterized constructor 
        System.out.println("Constructor is being called...");
    }

// constructor overloading is that we can call  construtor but different constructor will be called 
// according to the parameters like ::::
// if we have made different constructors but not default one then it will give error because we have made 
// different constructors no default constructor will be called because wehave made differnet constructors
// examples:::
// Constructor Overloading


//  SHALLOW COPY ::: THAT IS NOT SO DEEP AND NOT MUCH VISIBLE....

    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll= s1.roll;
    //     this.marks = s1.marks;
    // }

//  DEEP COPY CONSTRUCTOR ::: THAT IS VERY DEEP AND VISIBLE....
//   It does not changes the original value of the array....

    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = new int[s1.marks.length];
        for(int i = 0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }
    // parameterized constructor :::
    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
    Student(String name, int roll) {
        marks = new int[3];
        this.name = name;
        this.roll = roll;
    }
}

class BankAcc {
    public String username;
    private String password; // Private access modifier restricts access outside the class.
    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    String color;
    int tip;
    void setColor(String newColor) {
        color = newColor;
    }
    String getColor() {
        return this.color; // "this" keyword refers to the current object of the class.
    }
    int getTip() {
        return tip;
    }
    void setTip(int newTip) {
        tip = newTip;
    }
}



// Inheritance is when properties and methods of base class are passed on to derived class...


public class Oops{
    public static void main(String args[]) {
        // Creating and using Pen object
        Pen p1 = new Pen(); 
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(8);
        System.out.println(p1.getTip());

        // Creating and using BankAcc object
        BankAcc b1 = new BankAcc();
        b1.setPassword("acbfds"); // Setting password (cannot access it directly)
        // Creating Student objects
        Student s1 = new Student("Pandu");
        s1.marks[0]=98;
        s1.marks[1]=69;
        s1.marks[2]=84;
        System.out.println(s1.name);
        Student s2 = new Student("Jamshed", 69);
        Student s3 = new Student(s1);
        s3.password ="sdcdc";

// here after the copying of constructor we are changing the marks but also being changed 
// in the copied object because they refer to the same object.......

        s1.marks[2]=55;
        System.out.println(s3.marks[0]);
        System.out.println(s3.marks[1]);
        System.out.println(s3.marks[2]);
        System.out.println(s2.name);
    }
}
