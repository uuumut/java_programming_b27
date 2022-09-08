package b25_Scanner;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter miles");
        double miles = input.nextDouble();
        double km= miles*1.609;
        System.out.println(km);


    }
}
/*
Write a program that can convert Miles to KM
Ex:
Enter miles:
10.0
output:
10.0 miles equal to 16.09 kilometersc
 */