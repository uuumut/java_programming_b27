package b25_Statics;

public class Circle {
    public double radius;

    public double diameter;

    public static double pi = 3.14;

    public Circle(double radius){
        this.radius=radius;
        diameter  =radius*2;
    }
    public double area(){
      double area=pi*(radius*radius);
       return area;
    }
    public double perimeter(){
        double perimeter = 2*pi*radius;
        return perimeter;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}




/*
Circle Task:
1. Create a class named Circle:
Attributes:
instance: radius, diameter
static: pi
Add a constructor that can set All the
fields (instances)
HINT: we only need to know
the radius to set the radius & diameter
Actions:
calcArea(): returns the area
of Circle
calcPerimeter(): returns the
perimeter of Circle
printPi(): displays PI value
toString(): displays the
radius, diameter, pi, area and perimeter of the circle when the object of
circle is passed in the print statement
 */