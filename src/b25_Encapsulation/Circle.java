package b25_Encapsulation;

public class Circle {
    private double radius;
    public static double pi;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        if (radius<=0){
            return;
        }
        this.radius=radius;
    }

    public  double calcArea(){
       double   area= radius*radius*pi;
       return area;
    }
    public double calcPerimeter(){
        double perimeter = radius*2*pi;
        return perimeter;

    }
    static {
        pi =3.14;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area of circle=" + calcArea()+
                "perimeter of circle=" + calcPerimeter() +
                '}';
    }
}
