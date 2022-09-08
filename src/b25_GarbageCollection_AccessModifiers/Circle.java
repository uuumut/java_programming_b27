package b25_GarbageCollection_AccessModifiers;



import java.util.ArrayList;

public class Circle {
    public double radius;
    public  static double pi;
    public static  String name;

    public static ArrayList<Integer> numbers = new ArrayList<>();


    public Circle(double radius){
        this.radius = radius;
    //    pi= 3.14;  dont do this
    }
    static {
        pi = 3.14;
        name ="Circle";

        numbers= new ArrayList<>();
        numbers.add(10);
    }
}
