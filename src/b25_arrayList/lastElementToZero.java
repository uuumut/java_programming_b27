package b25_arrayList;

import java.util.ArrayList;

public class lastElementToZero {
    public static void main(String[] args) {
        ArrayList<Integer> nums =new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.set(nums.size()-1,0);

        System.out.println(nums);
    }
}
/*
 write a program that can set the last element of the Integer arraylist
to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];
 */