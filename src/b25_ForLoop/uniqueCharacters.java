package b25_ForLoop;

import java.util.Scanner;

public class uniqueCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String str = input.nextLine();
        String strUnique = "";
        for (int i = 0; i < str.length(); i++) {
          char item = str.charAt(i);
          boolean isUnique = str.indexOf(item)==str.lastIndexOf(item);
          /* if the first index of the character and last index of the character
            are same than the character is a unique character.

           */

          if (isUnique){
              strUnique +=item;
          }
        }
        System.out.println(strUnique);
    }
}
