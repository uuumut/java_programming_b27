package b25_ForLoop;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String str = input.nextLine();
        String str1 = "";
        int totalIndex = str.length() - 1;
        for (int i = totalIndex; i >= 0; i--){
            str1+= str.charAt(i);
        }
        System.out.println(str1);
        boolean isPalindrome = str.equalsIgnoreCase(str1);
        System.out.println(isPalindrome);
    }
}
