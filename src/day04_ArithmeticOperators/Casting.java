package day04_ArithmeticOperators;

public class Casting {
    public static void main(String[] args) {


        float averageScore = 20.5F;
        byte num1 = (byte) averageScore;
         int num2= (short) averageScore;
         double num3 = averageScore;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

        String ta ="a";
        ta +="b";
        String tb = "c";
        ta +=tb;
        ta.replace("c","d");
        System.out.println(ta);

    }
}