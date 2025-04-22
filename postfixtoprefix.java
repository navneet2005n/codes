import java.util.Stack;
public class postfixtoprefix {
      public static String postfixtoprefix1(String str){
        Stack <String> stk = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                String s = ch+"";
                stk.push(s);
            }
            else{
                String a = stk.pop();
                String b = stk.pop();
                String t = ch + b + a;
                stk.push(t);
            }
        }
        return stk.peek();
    }
    public static void main(String[] args) {
        String str1 = "953+4*6/-";
        System.out.println(postfixtoprefix1(str1));
    }
}
