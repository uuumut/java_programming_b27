package day03_varibales;

public class CarInfo {
    public static void main(String[] args) {
      int year = 2017;
      String make = "Mazda",
              model= "mazda6",
              miles= "15000km",
              color = "blue",
              price = "23000$";
        String carInfo = "\n"+ year +"\n"+make+"\n"+model+"\n"+miles+"\n"+color+"\n"+price;
        System.out.println("carInfo :" + carInfo);

    }
}
/*
1. Create a class called CarInfo.java
2. Declare the following variables:
1.year
2.make
3.model
4.miles
5.color
6.price
3. Use concatenation to print the full info of the car in
the following format:
Year  Make  Model,  Miles,  Color,  Price.




 */