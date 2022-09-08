package day08_scanner;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("what is your hourly rate? ");
        double hourlyRate = input.nextDouble();
        System.out.println("hours in week?");
        int hours = input.nextInt();
        double salary = hours * hourlyRate * 52;
        System.out.println("salary = " + salary);
    }
}
