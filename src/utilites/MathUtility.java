package utilites;

public class MathUtility {
    
    
    //sum of two integer numbers(int)
    public static int sumOfTwoNumbers(int num1,int num2){

        return  num1+num2;
    }
    //sum 0f two decimal numbers(double)
    public static double sumOfTwoNumbers(double num1,double num2){
        return num1+num2;
    }


    //subtraction of two integer numbers(int)
    public static int subtractionOfTwoNumbers(int num1,int num2){
       return   num1-num2;
    }
    //subtraction of two decimal numbers(double)
    public static double subtractionOfTwoNumbers(double num1,double num2){
        return num1-num2;
    }

    //multiplication of two integers (int)
    public static int multiplicationOfTwoNumbers(int num1,int num2){
        return num1*num2;
    }
    //multiplication of two integers (int)
    public static double multiplicationOfTwoNumbers(double num1,double num2){
        return  num1*num2;
    }

    //division of two integers (int)
    public static int divisionOfTwoNumbers(int num1,int num2){
        return  num1/num2;
    }
    //division of two integers (double)
    public static double divisionOfTwoNumbers(double num1,double num2) {
        return num1 / num2;
    }


    //check the number is even number
    public static boolean isEven(int num){
        if (num==0){
            System.err.println("number is zero");
            System.exit(0);
        }
        boolean isEven= false;
    if (num%2==0){
        isEven =  true;
    }
    return isEven;
    }
    //check the number is odd number
    public static boolean isOdd(int num){
        if (num==0){
            System.err.println("number is zero");
            System.exit(0);
        }
        boolean isOdd = false;
       if (!MathUtility.isEven(num)){
           isOdd = true;
       }
       return isOdd;
    }


    //check the maximum number between two numbers(int)
    public static int maxNumber(int num1, int num2){
        if (num1==num2){
            System.err.println("number is equal");
            System.exit(0);
        }
        if (num1>num2){
         return num1 ;
        } else{
          return num2;
        }
    }
    //check the maximum number between two decimal numbers(double)
    public static double maxNumber(double num1, double num2){
        if (num1==num2){
            System.err.println("number is equal");
            System.exit(0);
        }
        if (num1>num2){
            return num1 ;
        } else {
            return num2;
        }
    }

    //check the minimum number between two number (Int)
    public static int minNumber(int num1, int num2){
        if (num1==num2){
            System.err.println("number is equal");
            System.exit(0);
        }
        if (num1>num2){
            return num2 ;
        }else {
            return num1;
        }
    }
    //check the minimum number between two number (Int)
    public static double minNumber(double num1, double num2){
        if (num1==num2){
            System.err.println("number is equal");
            System.exit(0);
        }
        if (num1>num2){
            return num2 ;
        } else {
            return num1;
        }
    }

    //return the square of given integer (int)
    public static int squareOfNumber(int num){
        return num*num;
    }
    //return the square of given decimal number (double)
    public static double squareOfNumber(double num){
        return num*num;
    }


    //return the cube of given integer (int)
    public static int cubeOfNumber(int num){
        return num*num*num;
    }
    //return the square of given decimal number (double)
    public static double cubeOfNumber(double num){
        return num*num*num;
    }






}
