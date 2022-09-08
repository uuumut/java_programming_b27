package b25_String;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String str= scan.nextLine();
        char l = str.charAt(str.length()-1);
        if (str.charAt(0)==l){
            System.out.println("same");
        }else {
            System.out.println("not same");
        }

    }
}
/*
write a program that can check if the first and last characters of the
string are same
ex:
level
output:
same
 */