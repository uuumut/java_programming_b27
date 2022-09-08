package b25_String;

import java.util.Scanner;

public class TwoString {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a  first string");
        String s1 = input.nextLine();
        System.out.println(" enter a second string");
        String s2 = input.nextLine();
        if(s1.length()>s2.length()){
            System.out.println(s1+" is a longest string");}

            else if (s1.length()<s2.length()){
                System.out.println(s2 +"is a longest string");
            }else {
            System.out.println("string is equal");
        }
        }
    }

/*write a program that asks user to enter two strings, and print out the
longest string

 */