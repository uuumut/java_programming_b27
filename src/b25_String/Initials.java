package b25_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("enter first name");
        String f = scan.nextLine();
        System.out.println("enter last name");
        String l = scan.nextLine();
        char f1 = f.charAt(0);
        char l1 = l.charAt(0);
        System.out.println(f1+"."+l1);
    }
}
/*
write a program that can return the initials of the user
ex:
cybertek
school
output:
C.S
Note: Pay attention to the example output
 */