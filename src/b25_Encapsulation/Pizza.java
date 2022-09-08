package b25_Encapsulation;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
       setSize(size);
       setNumberOfCheeseTopping(numberOfCheeseTopping);
       setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize(){
        return size;
    }
    public void setSize(String size){
        boolean largeSize=size.equalsIgnoreCase("large");
        boolean mediumSize= size.equalsIgnoreCase("medium");
        boolean smallSize = size.equalsIgnoreCase("small");
        if (!(largeSize||mediumSize||smallSize)){
            System.err.println("Invalid size : size only can be small,medium,large");
            return;
        }
        this.size=size;
    }

    public int getNumberOfCheeseTopping(){
        return numberOfCheeseTopping;
    }
    public void setNumberOfCheeseTopping(int numberOfCheeseTopping){
        if (numberOfCheeseTopping<0 || numberOfCheeseTopping>5){
            System.err.println("Invalid : cheese topping can not be negative or more than 5 ");
            return;
        }

        if (size.equalsIgnoreCase("small")&&numberOfCheeseTopping>3){
            System.err.println("Invalid : if pizza size is small cheese topping can not more than 3");
          return;
        } else if (size.equalsIgnoreCase("medium")&&numberOfCheeseTopping>4) {
            System.err.println("Invalid : if pizza size is medium cheese topping can not more than 4");
            return;
        } else if (size.equalsIgnoreCase("large")&&numberOfCheeseTopping>5) {
            System.err.println("Invalid : if pizza size is large cheese topping can not more than 5");
            return;
        }
        this.numberOfCheeseTopping=numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping(){
        return numberOfPepperoniTopping;
    }
    public void  setNumberOfPepperoniTopping(int numberOfPepperoniTopping){
        if (numberOfPepperoniTopping<0||numberOfPepperoniTopping>6){
            System.err.println("Invalid : pepperoni topping can not be negative and can not be more than 6");
            return;
        }
        if (size.equalsIgnoreCase("small")&&numberOfPepperoniTopping>4){
            System.err.println("Invalid : if pizza size is small pepperoni topping can not more than 4");
            return;
        }
        else if (size.equalsIgnoreCase("medium")&&numberOfPepperoniTopping>5){
            System.err.println("Invalid : if pizza size is medium pepperoni topping can not more than 5");
            return;
        }
        this.numberOfPepperoniTopping=numberOfPepperoniTopping;
    }
    public double calcCost(){
        double totalCost=0;
        if (size.equalsIgnoreCase("small")){
            totalCost=10+2*(numberOfCheeseTopping+numberOfPepperoniTopping);
            }
        if (size.equalsIgnoreCase("medium")){
            totalCost=12+2*(numberOfPepperoniTopping+numberOfCheeseTopping);
        }
        if (size.equalsIgnoreCase("large")){
            totalCost=14+2*(numberOfCheeseTopping+numberOfPepperoniTopping);
        }
        return totalCost;
        }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total cost of pizza $=" + calcCost() +
                '}';
    }
}
/*
Pizza Task:
5.1 Create class named Pizza:
private variables:
size, numberOfCheeseTopping,
numberOfPepperoniTopping
Encapsulate all the fields
Conditions:
size of the
pizza can only be small, medium, large. case insensitive
Number of
cheese topping can not be negative, the maximum number of cheese topping
is:
small: 3
medium: 4
large: 5
Number of
pepperoni topping can not be negative, the maximum number of pepperoni
topping is:
small: 4
medium: 5
large: 6
Add a constructor that allows user to
set all the fields when the object is created.
(If the arguments not valid it should not be set to the instances)
Methods:
calcCost(): returns the
totalCost of the pizza
toString():returns a String
containing the pizza size, quantity of each topping, and the pizza cost as
calculated by calcCost()
Pizza cost is determined by:
S: $10 + $2 per topping
M: $12 + $2 per topping
L: $14 + $2 per topping
 */