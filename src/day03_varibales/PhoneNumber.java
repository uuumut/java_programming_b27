package day03_varibales;public class PhoneNumber {
   public static void main(String[] args) {


      int countryCode = 1;
      int areaCode = 778;
      int localNumber = 3250665;
      String output = "+" + countryCode + "(" + areaCode + ")"+"-" + localNumber;
      System.out.println("output = " + output);

   }
}