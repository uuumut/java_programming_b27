package b25_branchingStatementsAndLoop;

import java.util.Scanner;

public class calculateSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int sum = 0;
        while(num1>0){
            sum +=num1;
            System.out.println(sum);
            num1 = input.nextInt();


        }

    }
}
/*
Write a program that calculates the sum of numbers entered by the
user until user enters a negative number.
hint: you need an infinite loop
 */