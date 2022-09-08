package b25_Scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many total shares you have already?");
        int shares = input.nextInt();
        if(shares>0){
            System.out.println("How much your total value in the stock market is?");
        double totalValue= input.nextDouble();
        System.out.println("what is the name of the company have the most shares?");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("Your total stock market holding is "+ totalValue+" witch is made up of \n"
        +shares+" shares. "+ name +"INC is your company holdings");
        } else{
            System.out.println("pleas go fuc yourself");
        }

    }
}
/*
StockMarket task:
- Ask the user how many total shares they have already? (int)
-> If the user gives 0 or give a negative number none of the
rest condition should be executed
- Ask the user how much their total value in the stock market is
(double)
- Ask the user to enter the name of the company they have the
most shares in (String, multiple words)
- Print in the following format:
Ex:
inputs: 100, 25000, Apple INC
"Your total stock market holding is $25000 which is made up of
100 shares. Apple INC is your company holdings"
 */