package b25_branchingStatementsAndLoop;

import javax.script.ScriptContext;
import java.util.Locale;
import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double price = 0;
        System.out.println("what is your name ?");
        String name = input.next().toLowerCase();
        System.out.println("what is your gender?");
        String gender = input.next().toLowerCase();
        while(!(gender.equals("male")||gender.equals("female"))){
            System.out.println("please reenter");
            gender= input.next().toLowerCase();
        }
        System.out.println("are u married?");
        String married = input.next().toLowerCase();
        while(!(married.equals("yes")||married.equals("no"))){
            System.out.println("please reenter");
            married= input.next().toLowerCase();
        }
        System.out.println("enter your age");
        int age = input.nextInt();
        while(!(age>=0&&age<=120)){
            System.out.println("invalid reenter your age");
            age= input.nextInt();
        }
        System.out.println("how many miles you are going to drive a day");
        int miles = input.nextInt();
        while(miles<5){
            System.out.println("invalid reenter miles");
            miles= input.nextInt();
        }
        System.out.println("what kind of insurance you want?");
        String insurance = input.next().toLowerCase();
        while(!(insurance.equals("full")||insurance.equals("liability"))){
            System.out.println("invalid reenter insurance type");
            insurance = input.next().toLowerCase();
        }
        System.out.println("did you have any accidents or claims in last 5 years?");
        String claims = input.next().toLowerCase();
        while(!(claims.equals("yes")||claims.equals("no"))){
            System.out.println("invalid reenter");
            claims = input.next().toLowerCase();
        }
        System.out.println("do you have a anti-theft device");
        String antiTheft = input.next().toLowerCase();
        while (!(antiTheft.equals("yes")||antiTheft.equals("no"))){
            System.out.println(" invalid reenter");
            antiTheft = input.next().toLowerCase();
        }
        if (insurance.equals("liability")) {
            if (age < 25) {
                price += 90;
            } else {
                price +=50;
            }
            if (miles<=10){
                price+=10;
            } else if (miles>50) {
                price+=50;
            }else{
                price+=30;
            }

        }
        if (insurance.equals("full")){
            if (age < 25) {
                price += 160;
            } else {
                price +=120;
            }
            if (miles<=10){
                price+=20;
            } else if (miles>50) {
                price+=70;
            }else {
                price += 40;
            }
        }
        if (antiTheft.equals("yes")){
            price*=0.95;
        }
        if (claims.equals("yes")){
            price*=1.15;
        }else {
            price*=0.9;
        }if (married.equals("yes")){
            price*=0.95;
        }
        System.out.println(price);

    }
}
/*
Create a class called InsuranceQuote, write a program that can
calculate the insurance cost of a person based on the following info:
1. Ask the user to enter your name
2. Ask the user to enter your gender
(if user enters invalid entry, ask the user
to re-enter until user provides a valid entry)
3. Ask the user if he/she is married(Yes/No)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
4. Ask user to enter your age
(age can not be negative or
greater than 120)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
5. Ask user to enter how many miles he/she
drives in a day
(mileage can not be negative
or less than 5)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
6. Ask the user if he/she wants full coverage
or liability insurance?
7. Ask if he/she had any accidents or claims
in past 5 years (Yes/No)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
8. Ask the user if his/her car has an anti-
theft device (Yes/No)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
Calculate the price of the insurance and display all the
info of the user
Insurance Quote calculation:
starting prices for liability:
age < 25 ===> 90
age >= 25 ==> 50
miles <= 10 ====> $10
    miles > 10 and miles <= 50 ==>
$30
    miles > 50 ===>  $50
starting prices for full coverage:
age < 25 ===> 160
age >= 25 ==> 120
miles <= 10 ====> $20
    miles > 10 and miles <= 50 ==>
$40
    miles > 50 ===>  $70
    If the car has anti-theft device ==> 5%
discount
    If he/she had any accidents or claims in
past 5 years ===> 15% extra charge
    If he/she never had any accidents or
claims in past 5 years ==> 10% discount
    If he/she is married ==> 5% discount
 */