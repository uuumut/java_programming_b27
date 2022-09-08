package b25_forEachLoop;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1 = "adcb";
        String str2 = "acdb";
       char[] char1 = str1.toCharArray();
       char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        boolean equal = Arrays.equals(char1,char2);
        System.out.println(equal);
    }
}
