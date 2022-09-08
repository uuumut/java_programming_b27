package b25_ForLoop;

import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter two number");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int numMulti=0;
        for (int i = 0 ; i <num2 ; i++) {
            numMulti +=num1;
        }
        System.out.println(numMulti);
    }
}
/*
Write a program that asks user to enter two positive numbers,
then multiply those two numbers without using multiplication (*)
operator.
if user enters any negative numbers, print Invalid
Ex:
inputs:
10
20
output:
200
 */