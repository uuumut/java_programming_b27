package b25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPracticeOne {
    public static void main(String[] args) {
        String[] countries = {"japan","korea","united states","turkey","united kingdom","canada"};
        ArrayList<String> names = new ArrayList<>(Arrays.asList(countries));
        names.removeIf(p-> p.length()>=10);
        System.out.println(names);

        // converting arrayList to Array
        countries= names.toArray( new String[0]);
        System.out.println(Arrays.toString(countries));


    }
}

/*
create a array name countries
and removes all the countries name that have length of 10 or more
 */