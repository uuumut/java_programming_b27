package b25_customMethodVoid;

public class alcohol {
    public static void main(String[] args) {
        eligibleToBy(18);

    }
    public static void eligibleToBy(int age){
        if (age>=18){
            System.out.println("you are eligible tp by a alcohol");
        }else {
            System.out.println("you are not eligible to by alcohol");
        }

    }
}
/*
create a method that can check if a person is eligible to buy
alcohol
 */