package day12_Switch;

import utilites.ArraysUtility;
import utilites.StringUtility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String str= "fuc you";
        StringUtility.printEachChar(str);
       String str1 = StringUtility.reverseTheString(str);
        System.out.println(str1);
        String name ="not";
       boolean isPalindrome = StringUtility.isPalindrome(name);
        System.out.println(isPalindrome);
        boolean isAnagram = StringUtility.isAnagram("man","nam");
        System.out.println(isAnagram);
        String result= StringUtility.removesDuplicates("aaabbbbcccddd");
        System.out.println(result);

        System.out.println("..................");
        int[]arr={1,2,4,5};
       int maxNum = ArraysUtility.maximumNumberInTheArray(arr);
        System.out.println(maxNum);
        System.out.println("...........");
        ArraysUtility.printEachCharacterFromArray(arr);
        double[]arr1={3,2.2,4,23.5};
        double max = ArraysUtility.maximumNumberInTheArray(arr1);
        System.out.println(max);
        System.out.println("......");
        ArraysUtility.printEachCharacterFromArray(arr1);
        char[]arr2= {'a','f','d'};
        ArraysUtility.printEachCharacterFromArray(arr2);
        String[]arr3 = {"dad","dada","fsfas"};
        ArraysUtility.printEachCharacterFromArray(arr3);
        String[]arr4 = {"mon","min","mom"};
        String[] mergeArray= ArraysUtility.mergeTwoArrays(arr3,arr4);
        System.out.println(Arrays.toString(mergeArray));

    }
}
