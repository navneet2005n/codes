import java.util.Stack;
public class prefixtoinfix1 {
    public static String prefixtoinfix(String str){
        Stack <String> st = new Stack<>();
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if(ascii >= 48 && ascii <= 57){
                String o = ch + "";
                st.push(o);
            }
            else{
                String v1 = st.pop();
                String v2 = st.pop();
                String s = "(" + v1 + ch + v2 + ")";
                st.push(s);
            }
        }
            return st.peek();
    }
    
	public static void main(String[] args) {
	    String str1 = "+8/*-5324";
        System.out.println(prefixtoinfix(str1));
	}
}
