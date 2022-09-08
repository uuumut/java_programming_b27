package day08_scanner;
import java.util.Scanner;
public class Angles {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("enter three numbers:");
        float angle1 = input.nextFloat();
        float angel2 = input.nextFloat();
        float angle3 = input.nextFloat();
        float sum = angle1 + angel2 + angle3;
        boolean isTriangle = sum == 180;
        boolean isCircle = sum ==360;
        System.out.println("isTriangle = " + isTriangle);
        System.out.println("isCircle = " + isCircle);
    }
}
