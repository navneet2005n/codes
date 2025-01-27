// The Purpose of split(" ") vs. split("")
// split(" ") (Splitting by Space):
// When you use split(" "), it splits the string wherever there is a space character.
// This method breaks the string into words, assuming that words are separated by spaces.
// split("") (Splitting by Empty String):
// When you use split(""), it splits the string into individual characters, including spaces.
// This will break the entire string into its constituent characters, which means every single character, including spaces, will be treated as a separate element.

import java.util.*;
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

    
// Swap first and last character of each word in a string ::::

    public static String swap(String str){
        String result = "";
        String words[]= str.split(" ");
        for(String word:words){
        char firstchar = word.charAt(0);
        char lastchar =  word.charAt(word.length()-1);
            if(str.length()>1){
                result += lastchar + word.substring(1, word.length()-1) + firstchar+" " ; 
            }
            else{
                result+=word+" ";
            }
        }
        return result.trim();
    }
    public static String capifirstchar(String str){
        String result = "";
        String words[] = str.split(" ");
        for(String word: words){
            if(!word.isEmpty()){
                word = word.substring(0,1).toUpperCase()+word.substring(1)+" ";
            }
            result +=word;
        }
        return result.trim();
    }

    public static void main(String args[]){
        String str = "Mom and Dad are my best friend";
        System.out.println(cntpalindrome(str));
        System.out.println(swap(str));
        System.out.println(capifirstchar(str));
}
}


