package b25_returnMethod;

import java.util.Arrays;

public class addElement {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,3,6,5};
        int newNum = 9;
        int[] newArray = addNewElement(arr,newNum);
        System.out.println(Arrays.toString(newArray));

    }
    public static int[] addNewElement(int[]arr,int newNum){
        int[] newArr =new int[arr.length+1];
        int num = 0;
        for (int i : arr) {
         newArr[num++] =i;
        }
        newArr[newArr.length-1] =newNum;

        return newArr;
    }
}
/*
create a method named addElement that takes one integer array and
one integer, the method can add the Integer number after the  last index
of the integer array and returns the new array
Ex:
arr ={1,2,3};
num = 4;
addElement(arr, num) ==> {1,2,3,4}
 */