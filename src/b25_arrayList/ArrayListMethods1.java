package b25_arrayList;


import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers =new ArrayList<>();
        // add method : adds the data after the last index of ArrayList
        numbers.add(10);
        numbers.add(23);
        numbers.add(40);
        numbers.add(100);
        System.out.println(numbers);

        //add method with index: insert the element to the ArrayList based on given index
        numbers.add(3,150);
        numbers.add(5,76);
        System.out.println(numbers);

        // size method: get the total numbers of element(length)
        int totalSize = numbers.size();
        System.out.println(totalSize);
        // last index = size - 1
        int lastIndex = numbers.size()-1;
        System.out.println(lastIndex);

        // get method: get the element at the index
        Integer num = numbers.get(3); // Autoboxing
        int num1 = numbers.get(3); // Unboxing
        System.out.println(num);
        System.out.println(num1);
        // get all the index in the  ArrayList
        for (int i = 0; i <numbers.size() ; i++) {
            System.out.println(numbers.get(i));
        }


        // set method: replace the element at the given index to new element
        numbers.set(3,120);
        System.out.println(numbers);


        //remove method: decrease the element by one index (int==>index or non primitive ==> object)

        // If gives an int it removes the element at that index (remove int ,index)
        ArrayList<String> str = new ArrayList<>();
        str.add("mila");
        str.add("umut");
        str.add("bodak");
        str.add("tuma");
        str.add("azat");
        str.add("rahman");
        System.out.println(str);
         str.remove(2);
        System.out.println(str);
        // If gives  non primitive data it will be remove the given object.
        str.remove("rahman");
        System.out.println(str);


        // clear method: remove all the element from ArrayList
        str.clear();
        System.out.println(str);


        //indexOf method : check the index number of element from first index
        ArrayList<Character>chars =new ArrayList<>();
        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.add('a');
        chars.add('f');
        int indexNum= chars.indexOf('a');
        System.out.println(indexNum);
        // lastIndexOf : check the index number of element from last index
        int lastIndexNum= chars.lastIndexOf('a');
        System.out.println(lastIndexNum);


        //contains method : check the element if it is included in the ArrayList
        boolean included = chars.contains('a');
        System.out.println(included);
        boolean included1= chars.contains('z');
        System.out.println(included1);



        // equals method : check the two ArrayList are equal.
        boolean equals = numbers.equals(chars);
        System.out.println(equals);


        // isEmpty method : check the ArrayList is empty or not
        boolean empty = chars.isEmpty();
        System.out.println(empty);


        //




    }
}
