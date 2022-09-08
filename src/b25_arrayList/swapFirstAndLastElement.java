package b25_arrayList;

import java.util.ArrayList;

public class swapFirstAndLastElement {
    public static void main(String[] args) {
        ArrayList<Character> chars =new ArrayList<>();
        chars.add('v');
        chars.add('b');
        chars.add('c');
        chars.add('a');
        chars.add('f');
        Character ch= chars.get(0);
        chars.set(0,chars.get(chars.size()-1));
        chars.set(chars.size()-1,ch);
        System.out.println(chars);

    }
}
/*
write a program that can swap the first and last elements of an
integer arraylist
            ex:
                list = [1,2,3,4,5];
                output: [5,2,3,4,1];
 */