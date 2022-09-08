package b25_ForLoop;

import java.util.Scanner;

public class positiveAndNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 5 number");
        int num = 0;
        int num1 = 0;
        String result ="";
        for (int i = 1; i <6 ; i++) {
            int num3 = input.nextInt();
             if(num3>0){
                 num += 1;
             } else if (num3<0) {
                 num1 +=1;
             }
        }
        System.out.println(num+" positive"+num1+"negative");
    }
}
/*
Write a program that asks user to enter number for 5 times, and print
how many positive and negative numbers user entered
Ex:
Inputs:
10
20
-1
0
3
Output:
3 positive and 1 negative
 */