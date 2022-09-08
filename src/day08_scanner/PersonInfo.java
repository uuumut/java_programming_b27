package day08_scanner;

import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first name : ");
        String firstName = input.nextLine();
        System.out.println("enter your last name: ");
        String lastName = input.nextLine();
        System.out.println("enter your address");
        String address =  input.nextLine();
        System.out.println("this is your info: " + firstName+lastName+address);
    }
}
