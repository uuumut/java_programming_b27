package b25_Inheritance2.phoneTask;

public class Nokia extends Phone {
    public Nokia( String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefence(){
        System.out.println(brand+" "+model+" is self defending ");
    }
}
