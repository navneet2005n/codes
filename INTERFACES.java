public class INTERFACES {
    public static void main(String args[]){
        queen q1 = new queen();
        q1.moves();
        king k1 = new king();
        k1.moves();
        // example of multiple inheritance
        Bear b1 =new Bear();
        b1.carneat();
        b1.herbeat();
    }
}
    // interface is a blueprint of a class 
    // needs of interfaces ::
    // 1) multiple inheritance..
    // 2) total abstraction.. 
    //         Definition:: Total abstraction in Java means that a class is fully abstract, meaning it does not contain any 
    // concrete (implemented) methods. This is achieved using an interface or an abstract class with 
    // only abstract methods.
    // 1) All methods are public, abstract and without implementation..
    // 2) used to achieve total abstraction..
    // 3) variables in the interface are final, public and static 

    interface chessplayer{
        void moves();
    }
    class queen implements chessplayer{
        public void moves(){
            System.out.println("moves in every dirn... and also dagonally");
        }
    }
            // example of multiple inheritance:::::

    interface herbivore{
        void herbeat();
    }
    interface carnivore{
        void carneat();
    }

    class Bear implements herbivore,carnivore{
        public void herbeat(){
            System.out.println("eats grass..");
        }
        public void carneat(){
            System.out.println("eats meat as well..");
        }
    }

    class rook implements chessplayer{
        public void moves(){
            System.out.println("moves straight");
        }
    }
    
    class king implements chessplayer{
        public void moves(){
            System.out.println("moves in every dirn..");
        }
    }
