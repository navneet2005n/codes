// POLYMORPHISM ::: one thing many forms ...
// function overloading :: Multiple functions with same name but differnet parameters
//  or differnt number of parameters....
// function overloading is example of compile time polymorphism because compiler knows at compile time to compile...

    class Addition{
        public int add(int a,int b){
            return a+b;
        }
        public int add(int a,int b,int c){
            return a+b+c;
        }
        public int add(int a,int b,int c,int d){
            return a+b+c+d;
        }
        public float add(float a,float b){
            return a+b;
        }
    }

    // Method overriding is the method in which parent and child classes both contain same function 
    // with a different definition.....

    class Animal{
        void eat(){
            System.out.println("eats anything..");
        }
    }

    // here the method in the derived class overrides the method of the parent classs..

    class deer extends Animal{
        void eat(){
            System.out.println("eats grass...");
        }
    }

    public class polymorphism {
    public static void main(String args[]){
        Addition a1 = new Addition();
        System.out.println(a1.add(2,3,4));
        System.out.println(a1.add((float) 3,4));
        deer d1 = new deer();
        d1.eat();
        Animal a2 = new deer();  // it calls the method of the derived class because the 
        // object is formed of the class animal but it is pointing to the deer (derived class)..
        a2.eat();
    }
}


