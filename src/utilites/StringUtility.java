package utilites;

import java.util.Arrays;

public class StringUtility {
  //the method can print the every character in the string
    public static void printEachChar(String str){
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));
        }
    }

    // the method can reverse the string
    public static String reverseTheString(String str){
        String result = "";
        for (int i =str.length()-1; i>=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }

    //the method check the given String is palindrome or not.
    public static boolean isPalindrome(String str){
        return reverseTheString(str).equalsIgnoreCase(str);
    }

    //the method check the given two string is anagram or not.
    public static boolean isAnagram(String str1,String str2){
        char [] ch1=str1.toCharArray();
        char [] ch2 =str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);

    }

    //the method removes the duplicates from given string and return string.
    public static String removesDuplicates(String str){
        String result = "";
        for (int i = 0; i <str.length() ; i++) {
           String ch =""+ str.charAt(i);
            if(!result.contains(ch)){
                result+=ch;
            }

        }
        return result;
    }
}
