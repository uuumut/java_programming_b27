package b25_ForLoop;

import java.util.Scanner;

public class catAndDog {
    public static void main(String[] args) {
        String str = "caT dog dog cAt";
        String wordCat ="cat";
        String wordDog ="dog";
        int cat = 0;
        int dog = 0;
        for (int i = 0; i <str.length() ; i++) {
            int index = str.indexOf(' ',i);
            String word = index==-1?str.substring(i):str.substring(i,index);
            if (word.equalsIgnoreCase(wordCat)){
                cat +=1;
            } else if (word.equalsIgnoreCase(wordDog)) {
                dog +=1;
            }
        } boolean same =  dog ==cat;
        System.out.println(same);
    }
}
/*
write a program to print true if the string "cat" and "dog" appear the
same number of times in the given sentence
        Ex:
            sentence = "caT dog dogG cAt"
            output:
                true
 */