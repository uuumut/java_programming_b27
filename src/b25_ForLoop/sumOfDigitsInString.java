package b25_ForLoop;

import org.w3c.dom.ls.LSOutput;

public class sumOfDigitsInString {
    public static void main(String[] args) {
        int sum=0;
        String input= "A1B2C3";
        //for loop to get each char in the string
        for(int i=0;i<input.length(); i++){
            char item = input.charAt(i);
            // check if it is a digit
            boolean isDigit = item<=57 && item>=48;
            // if it is a digit, add it to the sum
            if(isDigit){
                sum += (item-48);
            }
            //else do nothing
        }
        System.out.println(sum);
    }
}
/*
Write a program that can return the sum of digits from a  string
Ex:
input: A1B2C3
output:    6
Hint: You need to get each of the character by using a loop
             To convert char to number:

   '0' - 48   ==> 0

   '1' - 48   ==> 1
 */