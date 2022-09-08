package b25_String;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a  word");
        String word = input.nextLine();
        char letter = word.charAt(0);
        if ('0'<=letter&&letter<='9'){
            System.out.println("first character is digit");
        } else if ('a'<=letter&&letter<='z') {
            System.out.println("first character is lowercase");

        } else if ('A'<=letter&&letter<='Z') {
            System.out.println("first character is uppercase");
        } else{
            System.out.println("first character is wrong");

        }
    }
}
/*
Ask user to enter a word,
if the word starts with digits, print "first character is digit"
if the word starts with uppercase letters, print "first character
is lowercase letter"
if the word starts with lowercase letters, print "first character
is uppercase letter"
if the word starts with special characters, print "first character
is special character"
HINT: 1. you need charAt() method
 */