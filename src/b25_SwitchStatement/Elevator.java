package b25_SwitchStatement;

public class Elevator {
    public static void main(String[] args) {

        int num = 3;
        String result = " ";
        if (num == 1 || num == 2 || num == 3) {
            if (num == 1)
                result = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            else if (num == 2)
                result = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
            else {
                result = "Floor 3 \n" +
                        "selected. Companies: Lyft, BofA, Stake house";
            }
        } else {
            result = "invalid";
        }
        System.out.println("result = " + result);

        System.out.println(" ................................ ");
        int num1= 5;
        String result1= " ";
        switch (num1){
            case 1 :
                result1="Floor 1 \n" +
                        "selected. Companies: Lobby, Verizon, Starbucks";
                break;
            case 2:
                result1="Floor 2 \n" +
                        "selected. Companies: Cybertek, NASA, Intelsat";
                break;
            case 3:
                result1="Floor 3 \n" +
                        "selected. Companies: Lyft, BofA, Stake house";
                break;
            default:
                result1="invalid";
        }
        System.out.println( result1);

        System.out.println(".....................");
    int num2= 1;
    String result2= ".";
    if (num2>=1&&num2<=3){
        switch (num2){
            case 1:
            result2="Floor 1 \n" +
                    "selected. Companies: Lobby, Verizon, Starbucks";
            break;
            case 2:
            result2="Floor 2 \n" +
                    "selected. Companies: Cybertek, NASA, Intelsat";
            break;
            default:
            result2="Floor 3 \n" +
                    "selected. Companies: Lyft, BofA, Stake house";

        }

    }else {
        result2="invalid";
    }

        System.out.println(result2);




    }
}
/*
Create a class called Elevator. A variable named floorNumber is
given, write a program that can display the floor info
when floorNum is 1 -> print "Floor 1
selected. Companies: Lobby, Verizon, Starbucks"
when floorNum is 2 -> print "Floor 2
selected. Companies: Cybertek, NASA, Intelsat"
when floorNum is 3 -> print "Floor 3
selected. Companies: Lyft, BofA, Stake house"
 anything else: print "Invalid floor - 6"
 Note:
 Solution 1: use nested if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
mixed
 */