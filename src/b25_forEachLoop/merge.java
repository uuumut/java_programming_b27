package b25_forEachLoop;

import java.beans.beancontext.BeanContextChild;
import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};
        int[] arr4 =new int[arr3.length+arr2.length+arr1.length];
        int n = 0;
        for (int each : arr1) {
            arr4[n++]=each;

        }for (int each : arr2) {
            arr4[n++]=each;

        }for (int each : arr3) {
            arr4[n++]=each;

        }

        System.out.println(Arrays.toString(arr4));



    }
}
/*
Write a program that can merge 3 arrays of integers
Ex:
arr1 = {30, 10, 20};
arr2 = {15, 40, 25, 35};
arr3 = {8, 9, 17, 5, 4, 1}
Output:
{30,10,20,15,40,25,35,8,9,17,5,4,1}

 */
