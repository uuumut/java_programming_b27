package b25_Inheritance2.phoneTask;

public class Iphone extends Phone {

    public Iphone( String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }
    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+model+" is face timing to "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand+" "+model+" is having a face time with "+email);
    }
}
