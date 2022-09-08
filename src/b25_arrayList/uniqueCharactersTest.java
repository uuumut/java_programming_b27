package b25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class uniqueCharactersTest {
    public static void main(String[] args) {
        String str = "aaaabccadddfgc";
        String result = "";
        ArrayList<String>list = new ArrayList<>(Arrays.asList(str.split("")));
        //for loop
        for (String ch : list) {
            int count = Collections.frequency(list,ch);
            if (count==1){
               result +=ch;
            }
        }
        System.out.println(result);

        System.out.println("---------------------------");


        // removeIf method
        list.removeIf(ch-> Collections.frequency(list,ch)>1);

        System.out.println(list);



    }
}
