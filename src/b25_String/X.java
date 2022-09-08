package b25_String;

import java.util.Scanner;

public class X {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.nextLine();
       if(word.charAt(0)=='x'){
           System.out.println(word.substring(1));
       }else {
           System.out.println(word);
       }
        System.out.println("...................");

        System.out.println("enter a word");
        String word1 = input.nextLine();
        if(word1.indexOf('x')==0){
            System.out.println(word1.substring(1));
        }else {
            System.out.println(word1);
        }

    }
}
/*
Ask user to enter a word. If the word starts with x, print the
word without x.
Input:
xcode
Output:
code */