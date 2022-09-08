package b25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class bulkOperation {
    public static void main(String[] args) {

        // bulk operation :argument must be a collection type

        /*Arrays:
        asList method (array of values) : returns the array as collection type
         */


        // addAll(collection type) : adds collection of values to the ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,67,7,2,1));
        System.out.println(numbers);


        // removeAll(collection type) : remove matching collection of values from ArrayList
        numbers.removeAll(Arrays.asList(1,2));
        System.out.println(numbers);


        //retainAll(collection type) : remove all the not matching elements from ArrayList
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.addAll(Arrays.asList(1,1,1,1,2,2,2,3,3,4,4,5,5));
        System.out.println(numbers1);
        numbers1.retainAll(Arrays.asList(4,5));
        System.out.println(numbers1);


        //containsAll(collection type) : check if the elements contains in the ArrayList
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(Arrays.asList(1,1,1,1,2,2,2,3,3,4,4,5,5,6,7,8));
        boolean include = numbers2.containsAll(Arrays.asList(6,7,8));
        System.out.println(include);
        boolean include1 = numbers2.containsAll(Arrays.asList(12,32,54));
        System.out.println(include1);


        // the ways to add non-primitive Arrays to ArraysList
        //first way:
        String [] arr = {"dad","ada","ded"};
        ArrayList<String> str = new ArrayList<>();
        str.addAll(Arrays.asList(arr));
        System.out.println(str);
        //Second way:
        String [] name = {"umut","mila","bodak"};
        ArrayList<String>names=new ArrayList<>(Arrays.asList(name));
        System.out.println(names);







    }
}
