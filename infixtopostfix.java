import java.util.Stack;
public class infixtopostfix {
    public static String infixtopostfix1(String str) {
        Stack<Character> op = new Stack<>();
        Stack<String> val = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if ((ascii >= 48 && ascii <= 57) || (ascii >= 97 && ascii <= 122)) { 
                // digits 0-9 or small letters a-z
                String s = "" + ch;
                val.push(s);
            }
            else if (op.isEmpty() || ch == '(' || op.peek() == '(') {
                op.push(ch);
            }
            else if (ch == ')') {
                while (op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = v1 + v2 + o;
                    val.push(t);
                }
                op.pop(); 
            }
            else {
                // changed this part below slightly
                if (ch == '+' || ch == '-') {
                    while (!op.isEmpty() && op.peek() != '(') {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = v1 + v2 + o;
                        val.push(t);
                    }
                    op.push(ch);
                }
                else if (ch == '*' || ch == '/') {
                    while (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/')) { 
                        // only pop * and / operators
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = v1 + v2 + o;
                        val.push(t);
                    }
                    op.push(ch);
                }
            }
        }

        while (!op.isEmpty()) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = v1 + v2 + o;
            val.push(t);
        }

        return val.peek();
    }
    public static void main(String[] args) {
        String str = "a+b*c";
        System.out.println(infixtopostfix1(str)); 
    }
}
