package b25_arrayList;

import java.util.ArrayList;

public class firstDuplicatedElement {
    public static void main(String[] args) {
        ArrayList<Integer> nums =new ArrayList<>();
        nums.add(1);
        nums.add(19);
        nums.add(5);
        nums.add(1);
        nums.add(5);
        nums.add(6);
        for (Integer num : nums) {
            if (nums.indexOf(num)!=nums.lastIndexOf(num)){
                System.out.println(num);
                break;
            }
        }
    }
}
/*
Write a program that can return the first duplicated element from an
arrayList of Integer
Ex:
list = [1,2,2,3,4,4,5,6,7,7];
output:
2
 */