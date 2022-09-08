package b25_arrayList;

import java.util.*;

public class returnNthLargestNumberFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> number =new ArrayList<>();
        number.addAll(Arrays.asList(1,2,3,4,5,6,7,10,12));
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
         int nth = input.nextInt();
        for (int i = 1; i <nth ; i++) {
            number.removeIf(p-> Collections.max(number)==p);
        }
       int nThNumber = Collections.max(number);
        System.out.println(nThNumber);
    }
}
/*
  remove the nth largest number from arraylist
 */