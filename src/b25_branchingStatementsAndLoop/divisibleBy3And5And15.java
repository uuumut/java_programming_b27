package b25_branchingStatementsAndLoop;

import java.util.Scanner;

public class divisibleBy3And5And15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String section15 =" ";
        String section5 = " ";
        String section3 = " ";
        for (int i = 1; i <= n; i++) {
            boolean divide15 = i%3==0&&i%5==0&&i%15==0;
            boolean divide5 = i%5==0&&i%15!=0;
            boolean divide3 = i%3==0&&i%15!=0;
            if (divide15){
                section15 +=i+" ";
            } else if (divide5) {
                section5 +=i+" ";
            } else if (divide3) {
                section3 +=i+" ";

            }

        }
        System.out.println(section3);
        System.out.println(section5);
        System.out.println(section15);
    }
}
/*
Write a program that can print the numbers between 1 ~ N that can
be divisible by 3, 5, and 15.
            if the number can be divisible by 3, 5 and
15,
                then it should only be displayed in
DivisibelBy15' section
            if the number can be divisible by 3 but
cannot be divisible by 15,
                then it should only be displayed in
DivisibelBy3' section
            if the number can be divisible by 5 but
cannot be divisible by 15,
                then it should only be displayed in
DivisibelBy5' section
            EX:
                input: 100
                Output:
                     Divisible By 15 15 30 45
60 75 90
                     Divisible By 5 5 10 20
25 35 40 50 55 65 70 80 85 95 100
                     Divisible By 3 3 6 9 12
18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */