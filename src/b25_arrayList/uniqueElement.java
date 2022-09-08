package b25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class uniqueElement {
    public static void main(String[] args) {
        // find with removeIf method
        ArrayList<String> names= new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Anna","Level","Level","Java","Python","Java"));
        names.removeIf(name-> Collections.frequency(names,name)>1);
        System.out.println(names);

        System.out.println("-----------------");

        // find with forEach loop
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('a','a','c','d','c','f'));
        for (Character character : list) {
            if (Collections.frequency(list,character)==1){
                System.out.println(character);
            }

        }

    }
}
