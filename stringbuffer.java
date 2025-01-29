public class stringbuffer {
    public static void main(String args[]){
        StringBuffer inst = new StringBuffer("hello");
        // inst.append(" wrld");
        inst.insert(5," wrld");
        inst.replace(5,10," java");
        inst.delete(6, 9);
        System.out.println(inst);
    }
}


// The length of "hello" is 5, so:
// Valid indices for insert(index, "text") are 0 to 5 (inclusive).
// Index 6 is out of bounds because the string only has 5 characters, and you can't insert beyond the last character.
// General Rule for insert(index, text)
// ✅ Valid indices = 0 to length of string
// ❌ Invalid index = Anything greater than string.length()


// sb.delete(6, 9);
// the delete(int start, int end) method removes characters from index start to end - 1, meaning index 9 is NOT included.
// How It Works?
// start (inclusive): Characters starting from index 6 are deleted.
// end (exclusive): Characters up to index 9 (but not including it) are deleted.
