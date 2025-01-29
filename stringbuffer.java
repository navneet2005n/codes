public class stringbuffer {
    public static void main(String args[]){
        StringBuffer inst = new StringBuffer("hello");
        // inst.append(" wrld");
        inst.insert(5," wrld");
        System.out.println(inst);
    }
}

// The length of "hello" is 5, so:
// Valid indices for insert(index, "text") are 0 to 5 (inclusive).
// Index 6 is out of bounds because the string only has 5 characters, and you can't insert beyond the last character.
// General Rule for insert(index, text)
// ✅ Valid indices = 0 to length of string
// ❌ Invalid index = Anything greater than string.length()

