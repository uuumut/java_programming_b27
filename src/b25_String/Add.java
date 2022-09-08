package b25_String;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two words");
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        String word3 = word1+word2;
        System.out.println(word3);
        if ((word1.charAt(word1.length()-1)==word2.charAt(0))){
            System.out.println(word3);
        }else {
            System.out.println("done");
        }
    }
}
/*
Ask user to enter two words. Then add them together and print.
But if the last letter of the first word and the first letter of the
last word is the same,
print that character once.
Input:
one
eight
Output:
oneight
 */