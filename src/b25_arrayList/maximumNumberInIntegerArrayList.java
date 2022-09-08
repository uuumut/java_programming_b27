package b25_arrayList;

import java.util.ArrayList;

public class maximumNumberInIntegerArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums =new ArrayList<>();
        nums.add(1);
        nums.add(19);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        Integer maxNum = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (maxNum<num){
                maxNum=num;
            }
        }
        System.out.println(maxNum);
    }
}
