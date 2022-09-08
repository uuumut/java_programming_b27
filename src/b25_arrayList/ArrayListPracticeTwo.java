package b25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPracticeTwo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("adil","ahmat","alim","umut","kaysar"));
        names.retainAll(Arrays.asList("adil","umut"));
        System.out.println(names);

        System.out.println("===================");
        String[] name = {"Maynur","Mayir","Muradil","Murat","Adil","alim"};
        ArrayList<String>list = new ArrayList<>(Arrays.asList(name));
        list.removeIf(p-> p.startsWith("M"));
       name= list.toArray(new  String[0]);
        System.out.println(Arrays.toString(name));
        System.out.println("===================");

    }
}
/*
 1) keep the name adil and umut
 2) Remove all the name that start with M
 */