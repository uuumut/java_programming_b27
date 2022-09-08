package b25_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -1;
        for (int i = 0; i < 6; i++) {
            System.out.println("enter a number");
            int num = scan.nextInt();
            if (num>max){
                max = num;

            }
        }System.out.println(max);



    } 
}
