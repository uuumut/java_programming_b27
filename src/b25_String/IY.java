package b25_String;

import java.util.Scanner;

public class IY {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word ");
        String word  = scan.nextLine();
        String word1 = word.substring((word.length()-2));
        if (word1.equals("ly")){
            System.out.println("really???");
        }else {
            System.out.println("never mind");
        }
    }
}
/*
ask the user to enter a word. if the word ends with "ly", print
"really???" ,  otherwise, print "never mind"
*/