package b25_returnMethod;

import java.util.Arrays;

public class returnMaxNumber {
    public static void main(String[] args) {
        int[]arr= {3,4,2,7,2,5,8,4,0};
        int maxNumber =maxNumberInArray(arr);
        System.out.println(maxNumber);
        int maxNumber1 =maxNumberInArray1(arr);
        System.out.println(maxNumber1);

    }
//sort statement solution!
    public static int maxNumberInArray(int [] maxNum ) {
        int result = 0;
        Arrays.sort(maxNum);
        result = maxNum[maxNum.length-1];
        return result;
    }
     // for each solution!
    public static int maxNumberInArray1(int [] maxNum1 ) {
        int maxNum = Integer.MIN_VALUE;
        for (int i : maxNum1) {
            if (maxNum < i) {
                maxNum = i;
            }
        }
        return maxNum;

    }
}
/*
create a method that can return the maximum number from an array
of integers
 */