package b25_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int king = 120;
        int queen = 100;
        int single = 80;
        while (true) {
            System.out.println("which type of room you want to reserve?");
            String reserve = input.next().toLowerCase();
            while (!(reserve.equals("king") || reserve.equals("queen") || reserve.equals("single"))) {
                System.out.println("invalid please reenter");
                reserve = input.next().toLowerCase();
            }
            int price = reserve.equals("king") ? 120 : reserve.equals("queen") ? 100 : 80;
            System.out.println("how many nights you want to staying?");
            int nightStay = input.nextInt();
            while (nightStay <= 0) {
                System.out.println(" invalid , please reenter");
                nightStay = input.nextInt();
            }
            System.out.println("would you like to reserve another room?");
            String otherRoom = input.next().toLowerCase();
            while (!(otherRoom.equals("yes") || otherRoom.equals("no"))) {
                System.out.println("invalid,would you like to reserve another room?");
                otherRoom = input.next().toLowerCase();
            }
           int totalPrice = nightStay * price;
            if (otherRoom.equals("no")) {
                System.out.println(totalPrice);

            }if (otherRoom.equals("yes"))
            System.out.println( totalPrice +=totalPrice);
        }

    }
}
/*
Create a class called RoomReservation, write a program for the room
reservation:
King Bed ==> 120$
Queen Bed ==> 100$
single Bed ==> 80$
the program asks the user which bedroom does he/she wants to
reserve, and how many nights he/she is staying.
Then Ask the user "would you like to reserve another room?""
if yes ==> repeat the entire steps
if no ==> return the  total price
If user enters any invalid entry,  ask the user to re-
enter until user provides a valid entry
 */