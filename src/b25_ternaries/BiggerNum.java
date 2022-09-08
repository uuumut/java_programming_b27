package b25_ternaries;

public class BiggerNum {
    public static void main(String[] args) {
        int num1 = 2,num2=8,num3=5;
        String result = (num1>num2&&num1>num3)?"num1 is a bigger"
                        :(num2>num1&&num2>num3)?"num2 is a bigger"
                        :"num3 is bigger";
        System.out.println("result = " + result);



    }
}
/*
Create a class called BiggerNum, write a program that checks for the
bigger of 3 numbers.
you get 3 int variables with DIFFERENT values: n1 , n2 and n3
if n1 is biggest output: "n1 is bigger"
if n2 is biggest output: "n2 is bigger"
if n3 is biggest output: "n3 is bigger"
NOTE: MUST USE TERNARY
 */