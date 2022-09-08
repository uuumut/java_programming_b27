package b25_whileLoop;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = input.nextInt();
        System.out.println("enter seconde number");
        int num2 = input.nextInt();
        System.out.println("enter a operator ");
        char ch = input.next().charAt(0);
        while (!(ch=='+'||ch=='-')){
            System.out.println("invalid please enter again");
             ch = input.next().charAt(0);
        }
        System.out.println(ch=='+'?num1+num2:num1-num2);
    }
}
