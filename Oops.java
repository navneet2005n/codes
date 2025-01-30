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

    // Default Constructor
    Student() {
        System.out.println("Constructor is being called...");
    }

// constructor overloading is that we can call  construtor but different constructor will be called 
// according to the parameters like ::::
// if we have made different constructors but not default one then it will give error because we have made 
// different constructors no default constructor will be called because wehave made differnet constructors
// examples:::
// Constructor Overloading

    Student(String name) {
        this.name = name;
    }
    Student(int roll) {
        this.roll = roll;
    }
    Student(String name, int roll) {
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
        System.out.println(s1.name);
        Student s2 = new Student("Jamshed", 69);
        System.out.println(s2.name);
    }
}
