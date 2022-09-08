package b25_Recap.Shape;

public class Square extends Shape {
    private double size;

    public Square(double size) {
        super("Square");
       setSize(size);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size<=0){
            System.err.println("Invalid size");
            System.exit(1);
        }
        this.size = size;
    }

    @Override
    public double area() {
        return size*size;
    }

    @Override
    public double perimeter() {
        return size*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                ", area ='" + area() + '\'' +
                ", perimeter ='" + perimeter() + '\'' +
                '}';
    }
}
