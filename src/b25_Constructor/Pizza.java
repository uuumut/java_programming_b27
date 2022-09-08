package b25_Constructor;

public class Pizza {
    public char size;
    public int numberOfCheeseTopping,numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){
        double startingPrice= (size=='s')?10 :(size=='m')?12:14;
        double totalPrice = startingPrice+ (numberOfCheeseTopping+numberOfPepperoniTopping)*2;
        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalPrice= $" + calcCost() +
                '}';
    }
}
