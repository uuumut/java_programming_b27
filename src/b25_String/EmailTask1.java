package b25_String;

public class EmailTask1 {
    public static void main(String[] args) {
   String email = "umut_mila@gmail.com";
   int underScore = email.indexOf("_");

   boolean underScoreExist = underScore!= -1;
   if (underScoreExist){
       int mail = email.indexOf("@");
       String firstName = email.substring(0,underScore); //mike
       String lastName = email.substring(underScore+1,mail); // tyson
       String swapEmail = email.replace(lastName,firstName).replaceFirst(firstName,lastName); //mike_mike

       System.out.println(swapEmail);
   } else {
       System.out.println(email);
   }

    }
}
/*
Create a class calledEmailTask1.
Assume that email address is constructed by person's first name and
followed by an underscore and last name.
Write a program that can swap first name with last name in the
email (Seperated by an underscore).
If the email doesn't contain an underscore print the given input
email.
Ex:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com
 */