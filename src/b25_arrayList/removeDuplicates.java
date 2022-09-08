package b25_arrayList;


import java.util.ArrayList;

public class removeDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(2);
        ArrayList<Integer>newNumbers= new ArrayList<>();
        for (Integer number : numbers) {
            if (newNumbers.contains(number)){
                continue;
            }else {
                newNumbers.add(number);
            }
        }
        System.out.println(newNumbers);
    }
}
