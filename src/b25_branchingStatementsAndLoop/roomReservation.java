package b25_branchingStatementsAndLoop;

import java.util.Scanner;

public class roomReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("do you want to reserve a room");
        String reserve = input.next().toLowerCase();
        if(reserve.equals("yes")){
            System.out.println("which type of room you want to reserve?");
            String room = input.next().toLowerCase();
            if (room.equals("king")){
                System.out.println("the room you reserved that the price is 120$");
            } else if (room.equals("queen")) {
                System.out.println("the room you reserved that the price is 100$");
            } else if (room.equals("single")) {
                System.out.println("the room you reserved that the price is 80$");
            }else {
                while(!(room.equals("king")||room.equals("queen")||room.equals("single"))){
                    System.out.println("invalid please reenter");
                    room = input.next().toLowerCase();
                    if (room.equals("king")){
                        System.out.println("the room you reserved that the price is 120$");
                    } else if (room.equals("queen")) {
                        System.out.println("the room you reserved that the price is 100$");
                    } else if (room.equals("single")) {
                        System.out.println("the room you reserved that the price is 80$");
                    }
                }
            }
        } else if (reserve.equals("no")) {
            System.out.println("have a nice day");

        }else{
            while(!(reserve.equals("yes")||reserve.equals("no"))){
                System.out.println("invalid please reenter");
                reserve = input.next().toLowerCase();
                if(reserve.equals("yes")){
                    System.out.println("which type of room you want to reserve?");
                    String room = input.next().toLowerCase();
                    if (room.equals("king")){
                        System.out.println("the room you reserved that the price is 120$");
                    } else if (room.equals("queen")) {
                        System.out.println("the room you reserved that the price is 100$");
                    } else if (room.equals("single")) {
                        System.out.println("the room you reserved that the price is 80$");
                    }else {
                        while(!(room.equals("king")||room.equals("queen")||room.equals("single"))){
                            System.out.println("invalid please reenter");
                            room = input.next().toLowerCase();
                        }
                    }
                }
            }
        }

    }
}
/*
Create a class called RoomReservation, write a program for the room
reservation, your program asks the user wants to reserve a room.
if user entered yes, then ask which type of room the user
wants to reserve. if user entered no, print "have a nice day"
(if user entered any invalid answer (other
than yes/no) ask user to reenter until user provides a valid entry)
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
the program should be able to display the room he/she reserved
and total price of the room.
(if the user selected an invalid room, ask the user to
reselect the room until user provides a valid entry)
 */



//good way//
/*
   Scanner input = new Scanner(System.in);
        System.out.println("do you want to reserve a room");
        String reserve = input.next().toLowerCase();

        //repeat till the answer is either yes or no
        while(!(reserve.equals("yes")||reserve.equals("no"))){
            System.out.println("invalid please re-enter");
            reserve = input.next().toLowerCase();
        }

        if(reserve.equals("yes")){
            System.out.println("which type of room you want to reserve?");
            String room = input.next().toLowerCase();

            //repeat till get valid answer
            while(!(room.equals("king")||room.equals("queen")||room.equals("single"))){
                    System.out.println("invalid please reenter");
                    room = input.next().toLowerCase();
            }

            if (room.equals("king")){
                System.out.println("the room you reserved that the price is 120$");
            } else if (room.equals("queen")) {
                System.out.println("the room you reserved that the price is 100$");
            } else if (room.equals("single")) {
                System.out.println("the room you reserved that the price is 80$");
            }

        } else if (reserve.equals("no")) {
            System.out.println("have a nice day"
 */