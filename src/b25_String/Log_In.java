package b25_String;

import java.util.Scanner;

public class Log_In {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String userName1 = "Cydeo";
        String password1 = "WoodenSpoon";
        System.out.println("enter your credentials");
        System.out.println("enter the user name");
        String userName= scan.nextLine();
        System.out.println("enter the password");
        String password = scan.nextLine();
        if (userName.equals(userName1)&&password.equals(password1)){
            System.out.println("logged in");
        }else{
            System.out.println("Incorrect username or password\" as error message");
        }

    }
}
/*
You are writing a code for the log-in function of the Cybertek
Application, assume that your credentials are:
username: Cydeo
password: WoodenSpoon
Ask the user to enter their credentials. If credentials are
matched, your program should print "Logged in."
otherwise print "Incorrect username or password" as error message
Hints: In order to login, both username and password MUST
be correct
you will need to use equals() method
 */