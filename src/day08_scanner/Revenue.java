package day08_scanner;
import java.util.Scanner;
public class Revenue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter a price:");
       double price = scan.nextDouble();
        System.out.println(" enter the quantity");
        int quantity = scan.nextInt();
        System.out.println("revenue:"+ price*quantity);


    }
}
