package b25_NestedLoop;

import b25_whileLoop.calculator;

import java.util.Scanner;

public class calculateTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("enter a first number");
            int num1 = scan.nextInt();
            System.out.println("enter a operator");
            char operator = scan.next().charAt(0);
            while(!(operator=='+'||operator=='-'||operator=='*'||operator=='/')){
                System.out.println("invalid .reenter ");
                operator = scan.next().charAt(0);
            }
            System.out.println("enter a second number");
            int num2 = scan.nextInt();
            int result =operator=='+'?num1+num2:operator=='-'?num1-num2:operator=='*'?num1*num2:num1/num2;
            System.out.println(result);
            System.out.println("do you want to continue");
            String startAgain = scan.next().toLowerCase();
            while(!(startAgain.equals("yes")||startAgain.equals("no"))){
                System.out.println("invalid.do you want to continue");
                startAgain = scan.next().toLowerCase();
            }
            if (startAgain.equals("no")){
                System.out.println("thank you to using Cydeo calculator!");
                break;
            }
        }
    }
}
/*
Write a program that can calculate two numbers.
1. Ask user to enter the first number
2. Ask user to enter a math operator (+,-
,/,*)
(if user enters any invalid operator,
repeat this step until user provides a valid operator)
3. Ask user to enter the second number
4. Display the result
5. Ask user if they want to continue?
(yes/no)
if yes ==> repeat the entire steps
if no ==> print "Thanks for using Cydeo
calculator!"
If user enters any invalid entry,  ask
the user to re-enter until user provides a valid entry
 */