import java.util.Stack;
public class postfixtoinfix1 {
     public static String postfixtoinfix(String str){
        Stack <String> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if(ascii>=48 && ascii<=57){
                String o = ch + "";
                st.push(o);
            }
            else{
                String v2 = st.pop();
                String v1 = st.pop();
                String s = "(" + v1 + ch + v2 + ")";
                st.push(s);
            }
        }
            return st.peek();
    }
	public static void main(String[] args) {
	    String str = "953+4*6/-";
        System.out.println(postfixtoinfix(str));
	}
}
