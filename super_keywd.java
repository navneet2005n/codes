public class super_keywd {
    public static void main(String args[]){
    mustad m1 = new mustad(); 
    horse h1 = new horse();
    // when we write super() in horse class then it goes to its parent class
    // by default in java, compiler calls the super keyword by default and go to the parent class....
}
}

    // super keyword is used to refer immediate parent claasss object....
    // 1) to acceess parent's properties...
    // 2) to acceess parent's functions...
    // 3) to acceess parent's constructor...

    class animal{
        String color;
        animal(){
            System.out.println("animal const is called...");
        }
    }

    class horse extends animal{
        horse(){
            super.color = "red";
            System.out.println("horse const is cALLED ");
            System.out.println(super.color);
        }
    }
    class mustad extends horse{
        mustad(){
            System.out.println("mustad const is called");
        }
    }
