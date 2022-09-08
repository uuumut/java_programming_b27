package b25_customMethodVoid;

public class convert {
    public static void main(String[] args) {
       convertToEuro(75);
       convertToLira(80);
       convertKgToLb(5);

    }
    public static void convertToEuro(double dollar){
       double euro =dollar*0.97;
        System.out.println(euro+"euro");
    }
    public static void convertToLira(double dollar){
        double lira = dollar*17.90;
        System.out.println(lira+"lira");
    }
    public static void convertKgToLb(double kg){
        double lb = kg*2.2;
        System.out.println(lb+"lb");
    }
}
/*
create a method that can convert dollar to euro

 */