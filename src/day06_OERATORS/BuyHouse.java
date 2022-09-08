package day06_OERATORS;

public class BuyHouse {
    public static void main(String[] args) {
        double creditScore = 750;
        double salary  = 75000;
        boolean buyAHouse1 = creditScore>=720 || salary>=100000;
        boolean buyAHouse2 = creditScore>=740 || salary>=80000;
        if (buyAHouse1||buyAHouse2){
            System.out.println("You can get a loan to buy a house");}
        else {
            System.out.println("You can not get a loan fo buy a house");}

      /*create a class BuyHouse

    declare and assign a credit score variable
    declare and assign a salary

    determine if you can get a loan to buy a house
    there is two ways to get a loan:
        credit score of 720 or above and salary of 100,000 or above
        credit score of 740 or above and salary of 80,000 or above
*/


    }
}
