package b25_Inheritance3.Car;

public class Tesla extends Car{
    public Tesla(
            String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
    }
    public void autoPilot(){
        System.out.println(brand+" "+ model+" is auto pilot mode");
    }
}
