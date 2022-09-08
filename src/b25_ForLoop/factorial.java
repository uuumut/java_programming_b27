package b25_ForLoop;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        long num = input.nextInt();
        for (long i = num; i>0; i-- ){
            if (i-1!=0){
                num *=i-1;
            }
        }
        System.out.println(num);
    }
}
