package b25_returnMethod;

import java.util.Arrays;

public class minimumNumber {
    public static void main(String[] args) {
        int[]arr= {1,2,5,3,6,4,9,6,2,1};
        int minNumber = minimumNumberInArray(arr);
        System.out.println(minNumber);
        int minNum = minimumNumberInArrayForEachSolution(arr);
        System.out.println(minNum);
        int minNUM = minimumNumberInArrayForLoopSolution(arr);
        System.out.println(minNUM);

    }
    public static int minimumNumberInArray(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static int minimumNumberInArrayForEachSolution(int[] arr){
        int minNumber = Integer.MAX_VALUE;
        for (int i : arr) {
            if (minNumber>i)
                minNumber=i;
        }
        return minNumber;
    }
    public static int minimumNumberInArrayForLoopSolution(int[] arr){
        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (minNumber>arr[i])
                minNumber=arr[i];
        }
        return minNumber;
    }
}
/*
create a method that can return the minimum number from an array
of integers

 */