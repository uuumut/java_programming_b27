package b25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {
       ArrayList<Integer> nums =new ArrayList<>();
       nums.add(1);
       nums.add(2);
       nums.add(3);
       nums.add(4);
       nums.add(5);
       nums.add(6);

        System.out.println(nums);
        for (Integer i = 0; i <nums.size() ; i++) {
           nums.set(i, nums.get(i)*2);
        }
        System.out.println(nums);

        System.out.println("----------");
        ArrayList<String> list =new ArrayList<>();
        list.addAll(Arrays.asList("man","man","man"));
       int n = Collections.frequency(list,"man");
        System.out.println(n);






    }
}
