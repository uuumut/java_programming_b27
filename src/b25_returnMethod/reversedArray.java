package b25_returnMethod;

import java.util.Arrays;

public class reversedArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int [] reversedArr = reversedArray(arr);
        System.out.println(Arrays.toString(reversedArr));

    }

    public static int[] reversedArray(int[]arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = arr.length-1,j=0; i >=0&&j<arr.length ; i--,j++) {
            reversedArr[j] = arr[i];
            }
        return reversedArr;
    }

}
/*
create a method that return the reversed array
{1,2,3,4,5} === >
{5,4,3,2,1}
 */