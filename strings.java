// The Purpose of split(" ") vs. split("")
// split(" ") (Splitting by Space):
// When you use split(" "), it splits the string wherever there is a space character.
// This method breaks the string into words, assuming that words are separated by spaces.
// split("") (Splitting by Empty String):
// When you use split(""), it splits the string into individual characters, including spaces.
// This will break the entire string into its constituent characters, which means every single character, including spaces, will be treated as a separate element.

public class strings {
    public static int cntpalindrome(String str){
        String words []= str.split(" ");
        int cnt = 0;
        for(String word:words){
            if(chkpalindrome(word)){
                cnt++;
            }
        }
        return cnt;
    }
    public static Boolean chkpalindrome(String word){
        String lowercaseword = word.toLowerCase();
        int length = lowercaseword.length();
        for(int i=0; i<length/2;i++){
            if(lowercaseword.charAt(i)!=lowercaseword.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "Mom and Dad are my best friend";
        System.out.println(cntpalindrome(str));
}}
