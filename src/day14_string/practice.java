package day14_string;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        ArrayList<Integer>list1 =new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4));
        list2.addAll(Arrays.asList(5,3,2,5));
        ArrayList<Integer>newList = new ArrayList<>();
        newList.addAll(list1);
        newList.addAll(list2);
        System.out.println(newList);


    }
}

