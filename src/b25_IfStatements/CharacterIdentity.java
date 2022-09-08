package b25_IfStatements;

public class CharacterIdentity {
    public static void main(String[] args) {

  char character =',';
  int num= (int)character;
  if (57>=num && 48 <= num){
      System.out.println("character = " + character+" is a digit");}
  else if ((90>=num && 65<= num)||(122>=num && 97<= num) ) {
      System.out.println("character = " + character+" is a Alphabetic");
  } else if ( (47>=num && 33<=num) || (64>=num && 58<=num) || (96>=num && 91<=num) ||(126>=num && 123<=num) ) {
      System.out.println("character = " + character + " is a special character");
  } else {
      System.out.println("invalid");}



    /*Create a class called Character Identity, and write a program that can
identify if the given character is a digit or Alphabetic Character(A~Z
or a~Z) or a special character
Ex:
ch = '@'
output:
Special Character
HINT: You may wanna check out the numbers of the
chracters on ASCII table

     */

    }
}
