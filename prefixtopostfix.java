import java.util.Stack;
public class prefixtopostfix {
        public static String prefixtopostfix1(String str){
        Stack <String> stk = new Stack<>();
        for(int i = str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                String s = ch + "";
                stk.push(s);
            }
            else{
                String val1 = stk.pop();
                String val2 = stk.pop();
                String t = val1 + val2 + ch;
                stk.push(t);
            }
        }
        return stk.peek();
    }
	public static void main(String[] args) {
        String str = "-9/*+5346";
        System.out.print(prefixtopostfix1(str));
	}
}
