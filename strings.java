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

// Capitalize firstchar of the string :::

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

// Count words :::

        public static int cntwrds(String str){
            String words[] = str.split("\\s+");
            if(words.length == 1 && words[0].isEmpty()){
                return 0;
            }
            return words.length;
        } 

    // concatenate string

        public static String cncat(String a,String b){
            return a+b;
        }

    //  reverse the order of words...

    public static String revorderwrd(String str){
        String words[]= str.split(" ");
        StringBuilder reversed = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            reversed.append(words[i]);
            if(i>0){
            reversed.append(" ");
            }
        }
        return reversed.toString();
    }

//     Implement atoi and itoa functions
// Implement the below functions with recursion from string library as your own functions.

// 1. itoa() function converts int data type to string data type.
// 2. atoi() function converts string data type to int data type.

    // class Result {
    //     static String itoa(int num) {
    //          return Integer.toString(num); // Corrected: `num.toString()` to `Integer.toString(num)`
    //     }
    //     static int atoi(String str) {
    //       return Integer.parseInt(str);    
    //     }
    //   }

    // MINIMIZE THE GIVEN STRING :::

    public static String getdesiredrresult(String str){
        StringBuilder s =new StringBuilder();
        char lastchar ='\0';
        for(char c : str.toCharArray()){
            if(c!=lastchar){
                s.append(c);
            }
            lastchar = c;
        }
        return s.toString();
    }
    
    public static void main(String args[]){
        String str = "Mom and Dad are my best friend";
        System.out.println(cntpalindrome(str));
        System.out.println(swap(str));
        System.out.println(capifirstchar(str));
        System.out.println(cntwrds(str));
        String s = "";
        System.out.println(cntwrds(s));
        String f = "this";
        String h = "hlowrld";
        System.out.println(cncat(f, h));
        System.out.println(revorderwrd(str));
        String se ="aaabbbccc";
        System.out.println(getdesiredrresult(se));
}
}


