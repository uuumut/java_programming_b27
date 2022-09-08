package b25_forEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class descendingOrder {
    public static void main(String[] args) {
        int[]numbers = {1,3,2,5,4};
        Arrays.sort(numbers);

        int[]descendNum=new int[numbers.length];
        for (int i = numbers.length-1,j=0; i >=0&&j< numbers.length ; i--,j++) {
            descendNum[j]=numbers[i];



        }
        System.out.println(Arrays.toString(descendNum));
    }
}
/*
Write a program that sort the array of integer in descending
order

 */