package b25_customMethodVoid;

public class integerType {
    public static void main(String[] args) {
        integerType(0);

    }
    public static void  integerType(int number){
        if (number>0){
            System.out.println("number is positive number ");
        }else if (number<0){
            System.out.println("number is negative number");
        }else {
            System.out.println("number is zero");
        }
    }
}
/*
create a method that can if the given integer is positive,
negative or zero
 */