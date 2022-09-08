package b25_Constructor;

public class Rectangle {
    public double length,width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double area() {
        return length * width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
