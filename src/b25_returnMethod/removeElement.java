package b25_returnMethod;

import java.util.Arrays;

public class removeElement {
    public static void main(String[] args) {
        int[] arr = {2,4,12,4,2};
        int index = 3;
        int[]newArray = removeElementFromArray(arr,index);
        System.out.println(Arrays.toString(newArray));

    }

    public static int[] removeElementFromArray(int[]arr, int index) {
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
}
/*
create a method named removeElement that passes one integer
array and one integer, the method removes the integer index from the
integer array and returns the new array
Ex:
array = {10, 20, 30, 40, 50, 60}
index = 2
removeElement(array, index) ==== {10,
20, 40, 50, 60}
 */