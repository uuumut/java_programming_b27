package b25_whileLoop;

import java.util.Locale;
import java.util.Scanner;

public class marryMe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("will you marry me?");
        String answer = input.next().toLowerCase();
        while (!(answer.equals("yes")||answer.equals("no"))){
            System.out.println("please say it again");
            answer = input.next().toLowerCase();
        }
        System.out.println(answer.equals("yes")?"congrats":"goodbye");

        }
        }


