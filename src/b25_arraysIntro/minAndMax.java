package b25_arraysIntro;

import java.util.Arrays;
import java.util.Scanner;

public class minAndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number=new int[10];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            System.out.println("enter a number ");

            number[i]= input.nextInt();
            if (min>number[i]){
                min = number[i];
            }
            if (max<number[i]){
                max=number[i];
            }
            System.out.println("max = " + max);
            System.out.println("min = " + min);
        }
        System.out.println(Arrays.toString(number));

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
