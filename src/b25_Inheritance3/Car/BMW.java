package b25_Inheritance3.Car;

public class BMW extends Car{
    public BMW( String model, int year, double price, String color) {
        super("BMW", model, year, price, color);
    }
    public void breakDown(){
        System.out.println(brand+" "+model+" break down every 100 miles");
    }
}
