package b25_ForLoop;

public class reviewString {
    public static void main(String[] args) {
        String str = "**ABman&&^99";
        int totalIndex = str.length()-1;
        String letters="";
        String numbers="";
        String characters="";

        for (int i = 0; i <= totalIndex; i++) {
            char character = str.charAt(i);
            boolean isLetter = (character>=65&&character<=90)||(character>=97&&character<=122);
            boolean isNum = character>=48&&character<=57;
            if (isLetter){
                letters +=character;
            } else if (isNum) {
                numbers +=character;
            }else {
                characters +=character;
            }
        }
        System.out.println("letters:" +letters);
        System.out.println("numbers:" +numbers);
        System.out.println("character:" +characters);
    }
}
/*
write a program that can retive the digits, letters and special
characters from a string
Ex:
input:
mn@#123Ab!
output:
letters: mnAb
digits: 123
special chars: @#!
 */