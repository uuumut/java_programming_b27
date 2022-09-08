package b25_customMethodVoid;

public class circle {
    public static void main(String[] args) {
        areaOfCircle(4);

    }
    public static void areaOfCircle(double radius){
        double pi = 3.14;
        double are = radius*radius*pi;
        System.out.println(are);
    }
}
/*
create a method that can calculate the area of a circle
 */