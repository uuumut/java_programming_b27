package b25_Recap.Shape;

public class shapeObject {
    public static void main(String[] args) {
        Square square = new Square(10);
        System.out.println(square);
        square.area();
        square.perimeter();
        Rectangle rectangle =new Rectangle(4.5,2.3);
        System.out.println(rectangle);
        rectangle.area();
        rectangle.perimeter();
        Circle circle = new Circle(22.3);
        System.out.println(circle);
        circle.area();
        circle.perimeter();
    }
}
