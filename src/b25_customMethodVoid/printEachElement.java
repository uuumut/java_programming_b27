package b25_customMethodVoid;

public class printEachElement {
    public static void main(String[] args) {
        int [] sss = {1,2,5,6};
        printEachElements (sss);

    }
    public static void printEachElements(int [] numbers){
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
/*
create a method named printEachElement that can print each
elements of an integer array
 */