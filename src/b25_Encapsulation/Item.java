package b25_Encapsulation;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        char[] arr = name.toCharArray();
         if (name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name : name can not be empty or blank");
            System.exit(0);
        }
         if (!Character.isLetter(arr[0])){
             System.err.println("Invalid name : name must start with letters");
             System.exit(0);
        }
        for (char c : arr) {
            if (!Character.isLetterOrDigit(c) && c!=' '){
                System.err.println("Invalid name : name can not contain any special\n" +
                        "characters other than space");
                System.exit(0);
            }
        }
        this.name=name;

    }

    public double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice){
        if (unitPrice<0){
            System.err.println("unit price can not be negative");
            System.exit(0);
        }
        this.unitPrice=unitPrice;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        if (quantity<0){
            System.err.println("quantity can not be negative");
            System.exit(0);
        }
        if (name.equalsIgnoreCase("toilet paper")&&quantity>1){
            System.err.println("invalid quantity");
            System.exit(0);

        }
        this.quantity=quantity;
    }

    public double calcCost(){
        double totalCost = unitPrice*quantity;
        return totalCost;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + calcCost() +
                '}';
    }
}







/*
Item Task
4.1create a class called Item
            private variables:
            name, unitPrice, quantity
Encapsulate all the fields:
Conditions:
name can not be empty or blank
name can not contain any special
characters other than space
name must start with letters
unit price can not be negative
quantity can not be negative
if the Item name is toilet paper
(case insensitive) then the quantity can not be more than 1
Add a constructor that allows user to set all the fields when
the object is created.
(If the arguments
not valid it should not be set to the instances)
instance methods:
calcCost(): returns the total cost
toString(): returns the name, unit price, quantity and
total cost info as calculated by calcCost()
 */