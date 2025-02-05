// public class constructor_chaining {
//     public static void main(String args[]){
//         b b1 = new b();
//     }
// }
// class a{
//     a(){
//         System.out.println("a 1");
//     }
// }
// class b extends a{
//     b(){
//         // this or super only one of these two can be at first at same time   
//         // this keyword ensures that the second constructor inside the same class will be called first
//         // before the first one,....
        
//         this(2,3);
//         System.out.println("b 1");
//     }
//     b(int k){
//         System.out.println("b 2");
//     }
//     b(int j,int i){
//         System.out.println("b 3");
//     }
// }
