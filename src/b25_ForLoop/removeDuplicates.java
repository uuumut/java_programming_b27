package b25_ForLoop;

import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String str = input.nextLine();
        String strRemove = "";
        for (int i = 0; i <str.length() ; i++) {
            char item = str.charAt(i);
            boolean isContains = strRemove.contains(""+item);
            if(!isContains){
                strRemove +=item;
            }
        }
        System.out.println(strRemove);
    }
}
