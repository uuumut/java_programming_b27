package utilites;

import java.util.Arrays;

public class ArraysUtility {
    // print each integer from the integer array in separate lines
    public static void printEachCharacterFromArray(int[] arr) {
        for (int each : arr) {
            System.out.println(each);
        }
    }

    // print each double from the double array in separate lines.
    public static void printEachCharacterFromArray(double[] arr) {
        for (double each : arr) {
            System.out.println(each);
        }
    }

    //print each char from the char array in separate lines.
    public static void printEachCharacterFromArray(char[] arr) {
        for (char each : arr) {
            System.out.println(each);
        }
    }

    //print each String from the String array in separate lines.
    public static void printEachCharacterFromArray(String[] arr) {
        for (String each : arr) {
            System.out.println(each);
        }
    }


    // return the maximum number from integer array
    public static int maximumNumberInTheArray(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    // return the maximum number from double array
    public static double maximumNumberInTheArray(double[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    // return the minimum number
    public static int minimumNumberInTheArray(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    // return the maximum number from double array
    public static double minimumNumberInTheArray(double[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    //check if the given integer is contained in the given array,returns boolean
    public static boolean isCharacterContainsInArray(int[] arr,int number){
        boolean result = false;
        for (int i : arr) {
            if (i==number){
                result = true;
            }
        }
        return result;
    }


    //check if the given doubleNUmber is contained in the given array,returns boolean
    public static boolean isCharacterContainsInArray(double[] arr,double number){
        boolean result = false;
        for (double i : arr) {
            if (i==number){
                result = true;
            }
        }
        return result;
    }

    //check if the given char is contained in the given array,returns boolean
    public static boolean isCharacterContainsInArray(char[] arr,char ch){
        boolean result = false;
        for (char i : arr) {
            if (i==ch){
                result = true;
            }
        }
        return result;
    }


    //check if the given string is contained in the given array,returns boolean
    public static boolean isCharacterContainsInArray(String[] arr,String str){
        boolean result = false;
        for (String i : arr) {
            if (i.equals(str)){
                result = true;
            }
        }
        return result;
    }

    // merge two given integer array
    public static int[] mergeTwoArrays (int[]arr1,int[] arr2) {
        int[] mergeArray = new int[arr1.length+arr2.length];
        int num = 0;
        for (int i : arr1) {
            mergeArray[num++] =i ;
        }
        for (int i : arr2) {
            mergeArray[num++] = i;
        }
        return mergeArray;
    }


    // merge two given double array
    public static double[] mergeTwoArrays (double[]arr1,double[] arr2) {
        double[] mergeArray = new double[arr1.length+arr2.length];
        int num = 0;
        for (double i : arr1) {
            mergeArray[num++] =i ;
        }
        for (double i : arr2) {
            mergeArray[num++] = i;
        }
        return mergeArray;
    }


    // merge two given char array
    public static char[] mergeTwoArrays (char[]arr1,char[] arr2) {
        char[] mergeArray = new char[arr1.length+arr2.length];
        int num = 0;
        for (char i : arr1) {
            mergeArray[num++] =i ;
        }
        for (char i : arr2) {
            mergeArray[num++] = i;
        }
        return mergeArray;
    }


    // merge two given String array
    public static String[] mergeTwoArrays (String[]arr1,String[] arr2) {
        String[] mergeArray = new String[arr1.length+arr2.length];
        int num = 0;
        for (String i : arr1) {
            mergeArray[num++] =i ;
        }
        for (String i : arr2) {
            mergeArray[num++] = i;
        }
        return mergeArray;
    }


    //reverse the given  integer array
    public static int[] reversedArray(int[]arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = arr.length-1,j=0; i >=0&&j<arr.length ; i--,j++) {
            reversedArr[j] = arr[i];
        }
        return reversedArr;
    }
    
    //reverse the given double array
    public static double[] reversedArray(double[]arr) {
        double[] reversedArr = new double[arr.length];
        for (int i = arr.length-1,j=0; i >=0&&j<arr.length ; i--,j++) {
            reversedArr[j] = arr[i];
        }
        return reversedArr;
    }
    
    //reverse the given char array
    public static char[] reversedArray(char[]arr) {
        char[] reversedArr = new char[arr.length];
        for (int i = arr.length-1,j=0; i >=0&&j<arr.length ; i--,j++) {
            reversedArr[j] = arr[i];
        }
        return reversedArr;
    }
    
    //reverse the given string array
    public static String[] reversedArray(String[]arr) {
        String[] reversedArr = new String[arr.length];
        for (int i = arr.length-1,j=0; i >=0&&j<arr.length ; i--,j++) {
            reversedArr[j] = arr[i];
        }
        return reversedArr;
    }
    
    
    //frequency of the character in the integer array
    public static int frequencyOfTheElement(int[]arr, int num){
        int count= 0;
        for (int i : arr) {
            if (num==i){
                count++;
            }
        }
        return count;
    }
    //frequency of the character in the double array
    public static int frequencyOfTheElement(double[]arr, double num){
        int count= 0;
        for (double i : arr) {
            if (num==i){
                count++;
            }
        }
        return count;
    }
    //frequency of the character in the char array
    public static int frequencyOfTheElement(char[]arr, char ch){
        int count= 0;
        for (char i : arr) {
            if (ch==i){
                count++;
            }
        }
        return count;
    }
    //frequency of the character in the String array
    public static int frequencyOfTheElement(String[]arr, String str){
        int count= 0;
        for (String i : arr) {
            if (str.equals(i)){
                count++;
            }
        }
        return count;
    }
    
    // edd an element to the given integer arrays
    public static int[] addNewElement(int[]arr,int newNum){
        int[] newArr =new int[arr.length+1];
        int num = 0;
        for (int i : arr) {
            newArr[num++] =i;
        }
        newArr[newArr.length-1] =newNum;

        return newArr;
    }

    // edd an element to the given double arrays
    public static double[] addNewElement(double[]arr,double newNum){
        double[] newArr =new double[arr.length+1];
        int num = 0;
        for (double i : arr) {
            newArr[num++] =i;
        }
        newArr[newArr.length-1] =newNum;

        return newArr;
    }

    // edd an element to the given char arrays
    public static char[] addNewElement(char[]arr,char newChar){
        char[] newArr =new char[arr.length+1];
        int num = 0;
        for (char i : arr) {
            newArr[num++] =i;
        }
        newArr[newArr.length-1] =newChar;

        return newArr;
    }

    // edd an element to the given String arrays
    public static String[] addNewElement(String[]arr,String str){
        String[] newArr =new String[arr.length+1];
        int num = 0;
        for (String i : arr) {
            newArr[num++] =i;
        }
        newArr[newArr.length-1] =str;

        return newArr;
    }
    
    
    // remove an element from the given array based on given index (int[])
    public static int[] removeElementFromArray(int[]arr, int index) {
        if (index<0||index>arr.length-1){
            System.err.println("invalid index "+ index);
            System.exit(0);
        }
        int[]newArray = new int[arr.length-1];
        int num = 0;
        for (int i=0; i<arr.length;i++){
            if (i==index){
                continue;
            }else {
                newArray[num++]=arr[i];
            }
        }
        return newArray;
    }

    // remove an element from the given array based on given index (double[])
    public static double[] removeElementFromArray(double[]arr, int index) {
        if (index<0||index>arr.length-1){
            System.err.println("invalid index "+ index);
            System.exit(0);
        }
        double[]newArray = new double[arr.length-1];
        int num = 0;
        for (int i=0; i<arr.length;i++){
            if (i==index){
                continue;
            }else {
                newArray[num++]=arr[i];
            }
        }
        return newArray;
    }

    // remove an element from the given array based on given index (char[])
    public static char[] removeElementFromArray(char[]arr, int index) {
        if (index<0||index>arr.length-1){
            System.err.println("invalid index "+ index);
            System.exit(0);
        }
        char[]newArray = new char[arr.length-1];
        int num = 0;
        for (int i=0; i<arr.length;i++){
            if (i==index){
                continue;
            }else {
                newArray[num++]=arr[i];
            }
        }
        return newArray;
    }

    // remove an element from the given array based on given index (String[])
    public static String[] removeElementFromArray(String[]arr, int index) {
        if (index<0||index>arr.length-1){
            System.err.println("invalid index "+ index);
            System.exit(0);
        }
        String[]newArray = new String[arr.length-1];
        int num = 0;
        for (int i=0; i<arr.length;i++){
            if (i==index){
                continue;
            }else {
                newArray[num++]=arr[i];
            }
        }
        return newArray;
    }



    //display the unique element in the array(int[])
    public static int[] uniqueElementInArray(int[]arr){
        int[] result ={};
        for (int each : arr) {
            if (ArraysUtility.frequencyOfTheElement(arr,each)==1){
                result =ArraysUtility.addNewElement(result,each);
            }
        }
        return result;
    }

    //display the unique element in the array(double[])
    public static double[] uniqueElementInArray(double[]arr){
        double[] result ={};
        for (double each : arr) {
            if (ArraysUtility.frequencyOfTheElement(arr,each)==1){
                result =ArraysUtility.addNewElement(result,each);
            }
        }
        return result;
    }

    //display the unique element in the array(char[])
    public static char[] uniqueElementInArray(char[]arr){
        char[] result ={};
        for (char each : arr) {
            if (ArraysUtility.frequencyOfTheElement(arr,each)==1){
                result =ArraysUtility.addNewElement(result,each);
            }
        }
        return result;
    }

    //display the unique element in the array(int[])
    public static String[] uniqueElementInArray(String[]arr){
        String[] result ={};
        for (String each : arr) {
            if (ArraysUtility.frequencyOfTheElement(arr,each)==1){
                result =ArraysUtility.addNewElement(result,each);
            }
        }
      
        return result;
    }

    // replace new element to old element based on given index in array(int[])
    public static int[] replaceElement(int[]arr,int index, int num){
        if (index<0||index>arr.length-1){
            System.err.println("invalid index "+ index);
            System.exit(0);
        }
        int[]newArr={};
        for (int each : arr) {
            arr[index]=num;
            newArr=ArraysUtility.addNewElement(newArr,each);
        }
        return newArr;
    }
    // replace new element to old element based on given index in array(double[])
    public static double[] replaceElement(double[]arr,int index, double num){
        if (index<0||index>arr.length-1){
            System.err.println("invalid index "+ index);
            System.exit(0);
        }
        double[]newArr={};
        for (double each : arr) {
            arr[index]=num;
            newArr=ArraysUtility.addNewElement(newArr,each);
        }
        return newArr;
    }
    // replace new element to old element based on given index in array(char[])
    public static char[] replaceElement(char[]arr,int index, char ch){
        if (index<0||index>arr.length-1){
            System.err.println("invalid index "+ index);
            System.exit(0);
        }
        char[]newArr={};
        for (char each : arr) {
            arr[index]=ch;
            newArr=ArraysUtility.addNewElement(newArr,each);
        }
        return newArr;
    }
    // replace new element to old element based on given index in array(String[])
    public static String[] replaceElement(String[]arr,int index, String str){
        if (index<0||index>arr.length-1){
            System.err.println("invalid index "+ index);
            System.exit(0);
        }
        String[]newArr={};
        for (String each : arr) {
            arr[index]=str;
            newArr=ArraysUtility.addNewElement(newArr,each);
        }
        return newArr;
    }


    //replace old element to new element in array(int[]);
    public static int[] replaceOldElementToNewElement(int[]arr,int newNUm,int oldNume){
        int[]newArr = {};
        for (int each : arr) {
            if (each==oldNume){
                each=newNUm;
            }
            newArr=ArraysUtility.addNewElement(newArr,each);
        }
        return newArr;
    }
    //replace old element to new element in array (double[]);
    public static double[] replaceOldElementToNewElement(double[]arr,double newNUm,double oldNume){
        double[]newArr = {};
        for (double each : arr) {
            if (each==oldNume){
                each=newNUm;
            }
            newArr=ArraysUtility.addNewElement(newArr,each);
        }
        return newArr;
    }
    //replace old element to new element in array  ch[];
    public static char[] replaceOldElementToNewElement(char[]arr,char newCh,char oldCh){
        char[]newArr = {};
        for (char each : arr) {
            if (each==oldCh){
                each=newCh;
            }
            newArr=ArraysUtility.addNewElement(newArr,each);
        }
        return newArr;
    }
    //replace old element to new element in array String[];
    public static String[] replaceOldElementToNewElement(String[]arr,String newStr,String oldStr){
        String[]newArr = {};
        for (String each : arr) {
            if (each.equals(oldStr)){
                each=newStr;
            }
            newArr=ArraysUtility.addNewElement(newArr,each);
        }
        return newArr;
    }


    //remove duplicate element in the array (int[])
    public static int[] removeDuplicateElement(int[]arr){
        int[]newArr={};
        for (int each : arr) {
            if (!ArraysUtility.isCharacterContainsInArray(newArr,each)){
                newArr=ArraysUtility.addNewElement(newArr,each);
            }
        }
        return newArr;
    }
    //remove duplicate element in the array (double[])
    public static double[] removeDuplicateElement(double[]arr){
        double[]newArr={};
        for (double each : arr) {
            if (!ArraysUtility.isCharacterContainsInArray(newArr,each)){
                newArr=ArraysUtility.addNewElement(newArr,each);
            }
        }
        return newArr;
    }
    //remove duplicate element in the array (char[])
    public static char[] removeDuplicateElement(char[]arr){
        char[]newArr={};
        for (char each : arr) {
            if (!ArraysUtility.isCharacterContainsInArray(newArr,each)){
                newArr=ArraysUtility.addNewElement(newArr,each);
            }
        }
        return newArr;
    }
    //remove duplicate element in the array (String[])
    public static String[] removeDuplicateElement(String[]arr){
        String[]newArr={};
        for (String each : arr) {
            if (!ArraysUtility.isCharacterContainsInArray(newArr,each)){
                newArr=ArraysUtility.addNewElement(newArr,each);
            }
        }
        return newArr;
    }



    //insert new element to given array based on given index and return new array  int[]
    public static int[] insertElement(int[]arr,int index,int element){
        int[] newArr =new int[arr.length+1];
        int num = 0;
        for (int each : arr) {
            newArr[index]=element;

        }
        return newArr;
    }


}