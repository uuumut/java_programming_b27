package b25_SwitchStatement;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String sizes = "fsfs";

        switch (sizes) {
            case "tall":
                System.out.println("price is $3.69");
                System.out.println("90 calories");
              break;
            case "grande":
                System.out.println("price is $3.99");
                System.out.println("120 calories");
                break;
            case "venti":
                System.out.println("price is $4.29");
                System.out.println("150 calories");
            default:
                System.out.println("invalid");
        }


        System.out.println("..............................");


        String sizes1 = "grande";
        String result = " ";
        String result1= " ";
    if (sizes1=="grande"|| sizes1=="tall"||sizes1=="venti"){
       switch (sizes1) {
           case "tall":
               result = "price is $3.69";
               result1 = "90 calories";
               break;
           case "grande":
               result = "price is $3.99";
               result1 = "120 calories";
            break;
           default:
               result="price is $4.29";
               result1="150 calories";

       }
    }else{
        result="invalid";
    }
        System.out.println(result);
        System.out.println(result1);















    }
}


/*
Create a class called  CappuccinoBuyer. A variable named Size is
given, write a program that can display the price and calories of
cappuccino
Valid sizes are tall, grande, venti and their
price & calories are:
tall:
price is $3.69
90 calories
grande:
120 calories;
120 calories
venti:
price is $4.29
150 calories
If the size is invalid then the output should
be "Invalid Size"
Note:
 Solution 1: use if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
 */
