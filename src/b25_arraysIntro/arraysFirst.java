package b25_arraysIntro;

import java.util.Arrays;

public class arraysFirst {
    public static void main(String[] args) {
        char [] letters = new char[26];

        for (char j='z',i =0; j>='a'&& i<letters.length ; j--,i++) {
            letters[i]= j;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("...............");
        char ch = 'a';
        for (int i = 0; i <letters.length ; i++) {
            letters[i]=ch;
            ch++;

        }
        System.out.println(letters);


    }
}
