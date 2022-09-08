package b25_arrayList;

import java.util.ArrayList;

public class minimumNumberInIntegerArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums =new ArrayList<>();
        nums.add(1);
        nums.add(-19);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        Integer minNum = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (minNum>num){
                minNum=num;
            }
        }
        System.out.println(minNum);
    }
}
