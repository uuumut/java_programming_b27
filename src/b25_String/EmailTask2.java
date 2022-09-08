package b25_String;

public class EmailTask2 {
    public static void main(String[] args) {
    String email = "UUNMUT_ffSDXderighi@apple.com";
    int indexOfUnderScore= email.indexOf('_');
    int indexOfDomain = email.indexOf('@');
    int indexOfDot= email.indexOf('.');
    String firstName = email.substring(0,indexOfUnderScore);
   firstName= firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
    String lastName = email.substring(indexOfUnderScore+1,indexOfDomain);
    lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
    String domain  = email.substring(indexOfDomain+1,indexOfDot);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(domain);

    }
}
/*
Create a class called EmailTask2.
Assume that email address is constructed by person's first name and
followed by an underscore and last name.
Write a program that will print out information about user based on
email. Print first name, last name, and domain.
First and Last name should be printed with proper format -
uppercase first letter and remaining lowercase.
Ex:
input:
craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi

 */