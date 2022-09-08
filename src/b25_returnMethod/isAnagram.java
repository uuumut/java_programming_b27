package b25_returnMethod;

import java.util.Arrays;

public class isAnagram {
    public static void main(String[] args) {
        String str1 = "man";
        String str2 = "rescue";
        boolean result  = isAnagram(str1,str2);
        System.out.println(result);

    }

    public static boolean isAnagram(String str1 , String str2) {
         char[]arr1 = str1.toCharArray();
         Arrays.sort(arr1);
         char[]arr2 = str2.toCharArray();
         Arrays.sort(arr2);
        boolean anagram = Arrays.equals(arr1,arr2);
        return anagram;

    }
}
/*
create a method named isAnagram that passes two String parameters,
the method returns true if the given two strings are anagram, otherwise
returns false
Ex:
str1 = "cba"
str2 = "bac";
isAnagram(str1, str2) ====> true

 */