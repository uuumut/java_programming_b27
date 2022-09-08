package b25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sum {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(-1,-1,1,-1,2,-2,2,3,-3,4,4,5,5));
        list.removeIf(p-> p<0);
        System.out.println(list);
        int sum = 0;
        for (Integer integer : list) {
            sum +=integer;
        }
        list.add(sum);
        System.out.println(list);

        for (Integer integer : list) {
            
        }

        System.out.println("=============");
        // sum of the numbers in the String
        String[] name1 = {"18","4","5"};
        ArrayList<String>list1 = new ArrayList<>(Arrays.asList(name1));
        Integer total = 0;
        for (String s : name1) {
           total += Integer.parseInt(s);
        }
        System.out.println(total);


    }
}
