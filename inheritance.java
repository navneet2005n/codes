class Animal{
        public void eat(){
            System.out.println("eats..");
        }
        public void drink(){
            System.out.println("drinks..");
        }
        public void breathe(){
            System.out.println("breathes..");
        }
    }
    
// single level inhreitance ::::
 // simple one base class and only one derived class that is deriving from the base class...
    
// multilevel inheritance :::  dog class will have properties of the Animal class
// hererichal inheritance ::: different derived classes from one base class(like dog and cat class from animal)
// hybrid inheritance ::: in this, there are different subclasses of a class and have differnet methods 
// mnultiple inheritance ::: in this type, one derived class inherits from two differnt base classes..
class Mammals extends Animal{
        int legs;
    }

    class Dog extends Mammals{
        String breed;
    }
    
    // derived class / subclass :::

    class Fish extends Animal{
        public void swim(){
            System.out.println("swims..");
        }
    }
    public class inheritance {
        public static void main(String args[]){
            Fish shark = new Fish();
            shark.eat();
        }
}
