package b25_returnMethod;

import java.util.Arrays;

public class theNumberContainsInTheArray {
    public static void main(String[] args) {
        int[]arr= {1,2,3,2,5};
        int num = 0;
        boolean result =  isContains(arr,num);
        System.out.println(result);

    }
    public static boolean isContains(int[]arr,int num) {
        for (int i : arr) {
            if (i==num){
                return true;
            }
        }
        return false;
    }
}
/*
Create a method named contains that passes one integer array and
one integer parameters, the method returns true if the given integer is
contained in the given array, otherwise returns false
Ex:
arr = {1,2,3,4,5,6,7};
num = 10;
contains(arr, num) ===>

 */