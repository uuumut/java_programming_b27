package b25_Inheritance.Phone;

public class Phone {
    public String brand;
    public String model;
    public String size;
    public double price;

    public void setInfo(String brand, String model, String size, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
    }

    public long call(long num){
        System.out.println(num);
        return num;
    }
    public long text(long num){
        return num;
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
