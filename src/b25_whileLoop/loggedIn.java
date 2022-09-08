package b25_whileLoop;

import java.util.Scanner;

public class loggedIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a user name ");
        String uerName = input.nextLine();
        System.out.println("enter a password");
        String password = input.nextLine();
        boolean rightAccount = (uerName.equals("mila")&&password.equals("umut"));
        int attempts = 3;

        while (!rightAccount&&attempts>0) {
            System.out.println("wrong username or password");
            System.out.println("please reenter username ");
            uerName = input.nextLine();
            System.out.println("please reenter password");
            password = input.nextLine();
            attempts--;
            rightAccount = (uerName.equals("mila") && password.equals("umut"));
        }

        if (rightAccount){
            System.out.println("logged in");
        }else {
            System.out.println("account locked");
        }


    }
}
