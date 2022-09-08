package utilites;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    // Collections : is utility class of collection


    public static void main(String[] args) {
        //sort ArrayList
        ArrayList<Integer> number = new ArrayList<>();
        number.addAll(Arrays.asList(3,1,2,6,4,9));
        System.out.println(number);
        Collections.sort(number);
        System.out.println(number);

        System.out.println("-------------------");
        //reverse ArrayList
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('a','b','c','d'));
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("----------------");
        // swap method
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.addAll(Arrays.asList(3,1,2,6,4,9,10,11,16));
        System.out.println(number1);
        Collections.swap(number1,1,4);
        System.out.println(number1);

        System.out.println("-------------------------");
        // max and min function
        ArrayList<Integer> number2 = new ArrayList<>();
        number2.addAll(Arrays.asList(3,1,2,6,4,9,10,11,16,-3,-8));
        int maxNum = Collections.max(number2);
        int minNum =  Collections.min(number2);
        System.out.println(maxNum);
        System.out.println(minNum);

        System.out.println("-------------------------");

        // replaceAll method
        ArrayList<Integer> number3 = new ArrayList<>();
        number3.addAll(Arrays.asList(3,1,2,6,4,9,10,11,10,10,10));
        System.out.println(number3);
        Collections.replaceAll(number3,10,1);
        System.out.println(number3);


        System.out.println("-------------------------");

        //frequency method
        ArrayList<Integer> number4 = new ArrayList<>();
        number4.addAll(Arrays.asList(3,1,2,6,4,9,10,11,10,10,10,1,1,1));
        System.out.println(number4);
        int count1 = Collections.frequency(number4,1); //find with element
        int count2 =  Collections.frequency(number4,number4.get(6)); // find with index
        System.out.println(count1);
        System.out.println(count2);











    }
}
