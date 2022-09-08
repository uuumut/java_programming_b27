package b25_customMethodVoid;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        isAnagram("love","evol");

    }
    public static void isAnagram(String str1,String str2){
        char[]arr1 = str1.toCharArray();
        Arrays.sort(arr1);
        char[]arr2 = str2.toCharArray();
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2)){
            System.out.println("this two string is anagram");
        }else {
            System.out.println("not a anagram");
        }


    }
}
/*
create a method that can check if two strings are anagram
 */