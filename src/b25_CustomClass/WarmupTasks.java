package b25_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {
    public static void main(String[] args) {
        // write a program that can swap first and las character
        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6));
        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);


        System.out.println("------------------------------");

        //write a program that can move all the zeros to the last index of arraylist
        //first way with same arraylist
        ArrayList<Integer>numbers1 = new ArrayList<>();
        numbers1.addAll(Arrays.asList(1,2,0,0,3,4,5,6));
        int size= numbers1.size();
        numbers1.removeAll(Arrays.asList(0));
        int newSize = numbers1.size();
        int zeroTotal= size-newSize;
        for (int i = 0; i <zeroTotal ; i++) {
            numbers1.add(0);
        }
        System.out.println(numbers1);
        System.out.println("------------------------");
        //Second way with new arraylist
        ArrayList<Integer>numbers2 = new ArrayList<>();
        numbers2.addAll(Arrays.asList(1,2,0,0,3,4,5,0,0,6));
        ArrayList<Integer>list = new ArrayList<>();
        for (Integer integer : numbers2) {
            if (integer!=0){
                list.add(integer);

            }
        }
        for (Integer integer1 : numbers2) {
            if (integer1==0){
                list.add(integer1);
            }
        }
        System.out.println(list);

        System.out.println("-------------------------");

        /*write a program that can extract the special characters , digits, and letters from a String and stores
        them into separate arraylist
         */

        String str = "afaf1275aw@$%#%6789$^AFGFG";
        ArrayList<Character>chars = new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            chars.add(str.charAt(i));
        }
        System.out.println(chars);
        ArrayList<Character>letters = new ArrayList<>(chars); // add all characters
        letters.removeIf(p-> !Character.isLetter(p));// remove the characters that not letters
        Collections.sort(letters);
        System.out.println("letters: "+ letters);
        ArrayList<Character> digits = new ArrayList<>(chars); // add all characters
       digits.removeIf(p-> !Character.isDigit(p)); //remove the characters that not digits
       Collections.sort(digits);
        System.out.println("digits: "+ digits);
        ArrayList<Character>specialCh = new ArrayList<>(chars); // add all characters
        specialCh.removeIf(p-> Character.isLetterOrDigit(p)); //remove the characters that are digits and letters
        Collections.sort(specialCh);
        System.out.println("special characters: "+ specialCh);

















    }
}


