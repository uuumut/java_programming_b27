package day12_Switch;

import utilites.ArraysUtility;
import utilites.MathUtility;

import java.util.Arrays;

public class testMathUtility {
    public static void main(String[] args) {
        int num = 5;
        boolean isEven = MathUtility.isEven(num);
        System.out.println(isEven);
        boolean isOdd = MathUtility.isOdd(num);
        System.out.println(isOdd);
        int num1 = 6;
        int max = MathUtility.maxNumber(num,num1);
        System.out.println(max);



        int[]arr= {4,4,4,4,4,8,8,5,5,5};
        int[]arr1 = ArraysUtility.removeDuplicateElement(arr);
        System.out.println(Arrays.toString(arr1));
        String[]str={"you","dan","what","you","you"} ;
        String[]newStr=ArraysUtility.removeDuplicateElement(str);
        System.out.println(Arrays.toString(newStr));

        double unit= 20.0;
        double nn= 100;
        double w= unit+nn;
        System.out.println(w);
        double bill = unit*5.0+100.0;
        System.out.println(bill);

        int[] nums= {4,2,6,1};
        int[] nums2 = ArraysUtility.insertElement(nums,2,100);
        System.out.println(Arrays.toString(nums2));




    }
}

