package b25_branchingStatementsAndLoop;

import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a first number");
        int num1 = input.nextInt();
        System.out.println("enter a second number");
        int num2 = input.nextInt();
        System.out.println("enter a operator");
        char ch = input.next().charAt(0);
        while ( !(ch=='-'||ch=='+'||ch=='*'||ch=='/')){
            System.out.println("invalid operator please reenter");
            ch = input.next().charAt(0);
        }
   int result = ch=='-'?num1-num2:ch=='+'?num1+num2:ch=='*'?num1*num2:num1/num2;
        System.out.println(result);
    }
}
/*
write a program to ask user to enter two number and math operator,
and return the result.
if the operator is invalid operator, ask user to re-enter
the operator until user provides a valid operator (+, -, *, /)
 */