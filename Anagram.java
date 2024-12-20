import java.util.Arrays;
import java.util.*;
import java.lang.*;


class Anagram {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        
        s1 = s1.replaceAll("\\s","");
        s2 = s2.replaceAll("\\s","");
        
        
        if(s1.length() != s2.length()){
            return false;
        }
        
        char [] charArray1 = s1.toCharArray();
        char [] charArray2 = s2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        return Arrays.equals(charArray1,charArray2);
        
    }
    
    public static void main(String[] args){
        String s1 = "geeks";
        String s2 = "kseeg";
       
       if(areAnagrams(s1,s2)){
            System.out.println(s1 + "and" + s2 + "are anagrams.");
        }else{
            System.out.println(s1 + "and" + s2 + "are not anagrams.");
        }
        
    }
}