package b25_arrayList;

import java.util.ArrayList;

public class customMethodForConvertArrayToArrayList {
    public static void main(String[] args) {
        int[] num= {1,2,4,6,7};
        ArrayList<Integer> number= new ArrayList<>(convertArrayToArrayList(num));




    }


    public static ArrayList<Integer> convertArrayToArrayList(int[]arr){
        ArrayList<Integer>numbers = new ArrayList<>();
        for (int each : arr) {
            numbers.add(each);
        }
        return numbers;
    }
}
