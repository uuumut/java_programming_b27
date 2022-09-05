package b25_Inheritance3.Car;

public class Toyota extends Car {
    public Toyota( String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    public void reliable(){
        System.out.println(brand+" "+ model +" is reliable");
    }
}
