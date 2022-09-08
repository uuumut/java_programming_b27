package day08_scanner;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num = input.nextInt();
        boolean divisibleBy2 = num%2==0;
        boolean divisibleBy3 = num%3==0;
        boolean divisibleBy5 = num%5==0;
        System.out.println(num+"is divisible by 2 " + divisibleBy2);
        System.out.println(num+ "is divisible by 3 " + divisibleBy3);
        System.out.println(num+ " is divisible by 5 "+ divisibleBy5);
    }
}
