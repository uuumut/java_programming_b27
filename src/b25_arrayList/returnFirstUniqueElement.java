package b25_arrayList;

import java.util.ArrayList;

public class returnFirstUniqueElement {
    public static void main(String[] args) {
        ArrayList<Integer> nums =new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(10);
        nums.add(1);
        nums.add(2);
        nums.add(6);
        // for loop solution
        for (int i = 0; i <nums.size() ; i++) {
            int count =0;
            for (int j = 0; j < nums.size() ; j++) {
                if (nums.get(i)== nums.get(j)){
                    count++;
                }
            }
            if (count==1){
                System.out.println(nums.get(i));
                break;
            }
        }

        /* for each loop solution
        for (Integer num : nums) {
            int numbers = 0;
            for (Integer each : nums) {
                if (num==numbers){
                    numbers++;
                }
            }
            if (numbers==1){
                System.out.println(num);
                break;
            }
        }

         */


    }
}
