package b25_String;

import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" enter two words");
        String word1 = input.nextLine();
        word1 = word1.substring(1);
        String word2 = input.nextLine();
        word2 = word2.substring(1);
        System.out.println(word1+word2);
    }
}
/*
Ask user to enter two words. Print first word without its first
character
then print the second word without its first character.
Input:
apple
banana
Output:
ppleanana
 */