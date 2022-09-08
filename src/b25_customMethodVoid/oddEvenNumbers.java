package b25_customMethodVoid;

public class oddEvenNumbers {
    public static void main(String[] args) {
        System.out.println("this are a odd numbers between 1 to 100");
        oddNumbers();
        System.out.println();
        System.out.println("this are a even numbers between 1 to 100");
        evenNumbers();

    }
    public static void oddNumbers(){
        for (int i = 1; i <100 ; i+=2) {
            System.out.print(i+" ");
        }

    }

    public static void evenNumbers(){
        for (int i = 0; i < 101; i +=2) {
            System.out.print(i+" ");
        }
    }
}
/*
create a method that can print odd numbers between 1~100 in a
same line saperated by space
 */