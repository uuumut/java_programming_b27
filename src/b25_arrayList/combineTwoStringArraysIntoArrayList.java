package b25_arrayList;

import java.util.ArrayList;

public class combineTwoStringArraysIntoArrayList {
    public static void main(String[] args) {
       String[]arr1 = {"man","girl","boy"};
       String[]arr2 = {"nan","gox"};
       ArrayList<String>str = new ArrayList<>();
        for (String each : arr1) {
            str.add(each);
        }
        for (String each : arr2) {
            str.add(each);
        }
        System.out.println(str);
    }
}
