package b25_arrayList;

import utilites.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class removeIfMethod {
    public static void main(String[] args) {

        // removeIf method: when we remove element under a condition(if the element we want to remove are unknown)

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6));
        numbers.addAll(Arrays.asList(1,2,3,4,5,6));
        numbers.addAll(Arrays.asList(1,2,3,4,5,6));

        numbers.removeIf(p-> p>1); // Lambda Expression
        System.out.println(numbers);


        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
        numbers1.removeIf(num-> num%2==0);
        System.out.println(numbers1);


        ArrayList<String>list = new ArrayList<>();
        list.addAll(Arrays.asList("name","man","fuc","done"));
        list.removeIf(word-> word.length()==3);
        System.out.println(list);
        list.removeIf(word-> word.startsWith("n"));
        System.out.println(list);


        System.out.println("-------------------------------");
        // remove palindrome
        ArrayList<String>names= new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Racecar","Level","Eye","Java","Python"));
        names.removeIf(word-> StringUtility.isPalindrome(word));
        System.out.println(names);






    }
}
