package b25_returnMethod;

import java.util.Arrays;

public class mergeTwoArrays {
    public static void main(String[] args) {
        int[]arr1 = {1,3,5,2};
        int[]arr2 = {3,1,2};
        int[]mergeArray = mergeTwoArraysForEachLoop(arr1,arr2);
        System.out.println(Arrays.toString(mergeArray));

    }

    public static int[] mergeTwoArraysForEachLoop (int[]arr1,int[] arr2) {
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
}
/*
create a method that can merge two arrays and returnj the new
array
arr1 = {1,2,3}
arr2 = {4,5}
{1,2,3,4,5}
 */