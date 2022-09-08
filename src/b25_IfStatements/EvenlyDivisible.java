package b25_IfStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {
       int num= 65;
       boolean divisibleBy2= num%2==0;
       boolean divisibleBy3= num%3==0;
       boolean divisibleBy5= num%5==0;
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy3 = " + divisibleBy3);
        System.out.println("divisibleBy2 = " + divisibleBy2);
    }

}
