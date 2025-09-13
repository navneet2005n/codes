import java.util.Stack;
public class pushatbottombyrec {
    public static void pushatbottom(Stack<Integer>s,int n){
        if(s.isEmpty()){
            s.push(n);
            return;
        }
        int top = s.pop();
        pushatbottom(s,n);
        s.push(top);
    }
    public static void main(String[] args) {
          Stack <Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        pushatbottom(s1,4);
        while(!s1.isEmpty()){
           System.out.println(s1.pop());
        }
    }
}

