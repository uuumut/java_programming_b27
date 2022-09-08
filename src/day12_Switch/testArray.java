package day12_Switch;

import utilites.ArraysUtility;

import java.util.Arrays;

public class testArray {
    public static void main(String[] args) {


        char[] arr = {'a','b','c','a','b'};
        char[] two = ArraysUtility.uniqueElementInArray(arr);
        System.out.println(Arrays.toString(two));
        char c = 'a';
        char[]newChar = ArraysUtility.addNewElement(arr,c);
        System.out.println(Arrays.toString(newChar));
        boolean contain = ArraysUtility.isCharacterContainsInArray(arr,'a');
        System.out.println(contain);
        double[] arr1 = {1.0, 2.0, 3.0,2.0,2.0};
        double f= 2.0;
        int number = ArraysUtility.frequencyOfTheElement(arr1,f);
        System.out.println(number);

        double min1 = ArraysUtility.minimumNumberInTheArray(arr1);
        System.out.println(min1);

        int [] num = {1,2,3,4,};
        int [] num1= new int[num.length];


                 for (int i = num.length-1,j=0; i >=0 && j<num.length ; i--,j++) {
                     num1[j]=num[i];
                 }
                 System.out.println(Arrays.toString(num1));

               String[]str = {"dad","Dwda","DWw","dad","dad","dad"} ;
               String word = "dad";
               String[] uniqueE= ArraysUtility.uniqueElementInArray(str);
                    System.out.println(Arrays.toString(uniqueE));
               String[]newStr = ArraysUtility.reversedArray(str);
               String[]run = {"fuc","off","dam","what"};
               int index = 3;
               String[]remove =ArraysUtility.removeElementFromArray(run,index);

        System.out.println(Arrays.toString(remove));
        int count= ArraysUtility.frequencyOfTheElement(str,word);
        System.out.println(count);
        String[]newString = ArraysUtility.addNewElement(str,word);
        System.out.println(Arrays.toString(newString));

        System.out.println("--------------------------------------");
        int [] ints={1,2,2,3,3,4,5,1,4,5};


    }
}