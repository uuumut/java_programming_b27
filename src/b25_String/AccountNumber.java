package b25_String;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter an account number ");
        String number = input.nextLine();
        String startsWith = number.substring(0,3);
        int num = number.length();
        boolean isValid = (startsWith.equals("a 2")&&num==7) || (startsWith.equals("a 5")&&num==10);
        if (isValid){
            System.out.println("account number is valid");
        }else{
            System.out.println("invalid");
        }

    }
}
/*
Create a class called AccountNumber.
Ask the user enter an account number (String). Check if these
account number is valid.
> If the account number begins with a â2â the account
number should be 7 characters long
> If the account number begins with a â5â the account
number should be 10 characters long
â> If the account number does not begin with a 2 or a 5 OR
the account number lengths
do not meet the expected results print âInvalid
account numberâ
 */