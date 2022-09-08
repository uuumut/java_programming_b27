package b25_Inheritance3.Car;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry",2020,23000,"Gray");
        Tesla tesla = new Tesla("X",2018,40000,"white");
        BMW bmw = new BMW("x6",2014,25000,"black");
        System.out.println(tesla);
        System.out.println(toyota);
        System.out.println(bmw);
    }
}
