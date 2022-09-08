package b25_Constructor;

import b25_Constructor.Pizza;

import java.util.ArrayList;
import java.util.Arrays;

public class pizzaOrder {
    public static void main(String[] args) {
      /*
        double totalPrice = 0;
        ArrayList<Pizza>pizzas1= new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
          pizzas1.add(new Pizza('s',2,3))  ;
        }
        System.out.println(pizzas1.size());
        for (Pizza pizza : pizzas1) {
            totalPrice+= pizza.calcCost();
        }

        ArrayList<Pizza>pizzas2= new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            pizzas2.add(new Pizza('m',3,4))  ;
        }
        System.out.println(pizzas2.size());
        for (Pizza pizza : pizzas2) {
            totalPrice +=pizza.calcCost();
        }

        ArrayList<Pizza>pizzas3= new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            pizzas3.add(new Pizza('l',4,5))  ;
        }
        System.out.println(pizzas3.size());
        for (Pizza pizza : pizzas3) {
            totalPrice +=pizza.calcCost();
        }
        System.out.println(totalPrice);

       */

        //Second way
        double totalPrice =0;

        ArrayList<Pizza>pizzas= new ArrayList<>();
        for (int i = 0; i < 100; i++) {
        Pizza smallPizza=(new Pizza('s',2,3));
        Pizza mediumPizza=(new Pizza('m',3,4))  ;
        Pizza largePizza= (new Pizza('l',4,5))  ;
        pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));
        }
        for (Pizza pizza : pizzas) {
            totalPrice +=pizza.calcCost();
        }
        System.out.println(totalPrice);




    }
}
