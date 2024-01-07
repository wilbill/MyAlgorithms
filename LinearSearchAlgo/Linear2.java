package LinearSearchAlgo;

import static java.lang.StringUTF16.charAt;

//search for a string in a given code
public class Linear2 {
    public static void main(String[] args) {

    }
    //NB, Null is also a value in strings. ie can be like
    // String s = null;
    //s.length() //gives null pointer exception here, so we cant even get length;
    //we use length() coz its a method in strings, while just length is a field in other stuffs like arrays etc

    public static String searcString(String s){
        if(s == null || s.length()==0) return null; //we can use s.isEmpty() instead of s.length()==0

        char searched = s.charAt(0); //this cant be 1st line coz of null pointer exception may arise if s==null.
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==searched){
                return "Character Found";
            }
        }
        return null;
    }
}
