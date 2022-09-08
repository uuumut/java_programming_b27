package b25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class reverseArrayAndArrayList {
    public static void main(String[] args) {
        int[] num1= {1,2,3,4,5,6};
        int[] num2 = new int[num1.length];
        for (int i= 0, j=num1.length-1 ; i <num1.length && j>=0; i++,j--){
            num2[j]=num1[i];
        }
        System.out.println(Arrays.toString(num2));

        System.out.println("=======================");
        ArrayList<Integer>list =new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));
        System.out.println(list);
        ArrayList<Integer>newList =new ArrayList<>();
        for (int i = list.size()-1; i >=0 ; i--) {
            newList.add(list.get(i));
        }
        System.out.println(newList);
    }
}
