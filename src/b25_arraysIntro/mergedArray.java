package b25_arraysIntro;

import java.util.Arrays;

public class mergedArray {
    public static void main(String[] args) {
        int [] arrayA = {1,2,3,4};
        int [] arrayB = {5,6,7,8};
        int [] mergedArray =new int[arrayA.length+arrayB.length];
        int m = 0;
        for (int i = 0; i< arrayB.length ; i++) {
            mergedArray[m]=arrayA[i];
            m++;
            mergedArray[m]=arrayB[i];
            m++;

        }
        System.out.println(Arrays.toString(mergedArray));
    }
}

// mergedArray = [1,5,2,6,3,7,4,8]