    
// Abstraction is the process of hiding all the unnecessary details and showing only the important 
// parts to the user . we only give the idea in it not implementation ... 

// Abstract classes :::  
// 1) cannot create an instance of an abstract class...
// 2) can have abstract/non abstract methods...
// 3) can have constructors...


public class abstraction {
    public static void main(String args[]) {

// Java ensures that superclass constructors are always called before subclass constructors to 
// ensure proper initialization of fields inherited from the parent class.

        mustang myhorse =new mustang();
        // Horse h1 = new Horse();
        // h1.eats();
        // h1.walk();

        // Chick c1 = new Chick();
        // c1.walk();
        // c1.eats();


        // Animal class cannot have any object as it is an abstract class.
    }
}

abstract class Animal {
    Animal(){
        System.out.println("Animal constructor called..");
    }
    void eats() {
        System.out.println("Eats food");
    }
    abstract void walk(); /// give only idea not implementation
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor called..");
    }
    void walk() {
        System.out.println("Walks on 4 legs..");
    }
}

class mustang extends Horse{
    mustang(){
        System.out.println("mustang const called..");
    }
}

class Chick extends Animal {
    void walk() {
        System.out.println("Walks on 2 legs..");
    }
}

