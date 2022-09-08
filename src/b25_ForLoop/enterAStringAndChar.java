package b25_ForLoop;

import java.util.Scanner;

public class enterAStringAndChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String str = input.nextLine();
        System.out.println("enter a char");
        String character = input.nextLine();
        int num = 0;
        for (int i=0; i<str.length();i++){
            String item = "" + str.charAt(i);
            if(item.equals(character)){
                num +=1;
            }
        }
        System.out.println(num);
    }
}
/*
Write a program that asks user to enter a string and a char, the
returns the frequency of the char from the given string
Ex:
inputs:
str = "aabcccd";
char = 'c';
output: 3
inputs:
"Java programming language"
'g'
output: 4
 */