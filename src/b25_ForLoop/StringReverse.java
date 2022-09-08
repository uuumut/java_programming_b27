package b25_ForLoop;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String str = input.nextLine();
        int totalIndex = str.length() - 1;
        for (int i = totalIndex; i >= 0; i--) {
            char letter = str.charAt(i);
            System.out.print(letter);
        }

    }
    }

