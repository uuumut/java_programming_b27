package b25_Encapsulation;

import utilites.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class candiesFactory {
    public static void main(String[] args) {

        ArrayList<Candies>list=new ArrayList<>();

        Candies candies1 = new Candies("kit-kat",8,0,true);
        Candies candies2 = new Candies("wawa",67,1.8,false);
        Candies candies3 = new Candies("xiaotu",18,2.5,true);
        Candies candies4 = new Candies("dsead",16,1,false);
        list.addAll(Arrays.asList(candies1,candies2,candies3,candies4));
        System.out.println(list);
        for (Candies candies : list) {
            System.out.println( candies.getBrand()+" "+ candies.getPrice());
        }





    }
}
/*
Create a class named CandyFactory
Create an ArrayList of candies
Add five objects of candies
use for each loop to print the brand and price of each
candy
 */