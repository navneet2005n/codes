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
