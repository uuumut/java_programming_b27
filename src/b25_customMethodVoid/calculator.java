package b25_customMethodVoid;

public class calculator {
    public static void main(String[] args) {
        calculator(7,8,'+');

    }
    public static void calculator(double num1,double num2, char operator){

        System.out.println( (operator=='+')?num1+num2:(operator=='-')?num1-num2:(operator=='*')?num1*num2:(operator=='/')?num1/num2:"invalid");
    }
}
/*
reate a method named calculator that passes three arguments
(num1, num2, mathOperator), prints the calculation result

 */