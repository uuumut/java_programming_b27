package b25_Statics;

public class Iphone {
    public static  String brande = "Apple";
    public String models ;
    public double price;
    public static String OS = "IOS";
    public String color ;
    public String size;
    public static String madeIn ="China";
    public static boolean hasBattery =true;
    public static boolean isTouchScreen =true;
    public static boolean hasFaceTime =true;

    /*
    Static method does not accept instance:

    public static void modelAndPrice(){
        System.out.println(models+" : "+price);
    }

     */
    // instance method accept static object
    public void method1(){
        System.out.println(models+" : "+price);
        System.out.println(OS);
    }
}
