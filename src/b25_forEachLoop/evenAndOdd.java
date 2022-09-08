package b25_forEachLoop;

public class evenAndOdd {
    public static void main(String[] args) {
        int[]num={7,1,6,4,3,8,4,0,9};
        String even="even: ", odd="odd: ",zero="zero: ";
        for (int each : num) {
            if (each%2==0&&each!=0){
                even+=each;
            }else if (each%2!=0){
                odd+=each;
            } else if (each==0) {
               zero+=each;
            }
        }
        System.out.println(even);
        System.out.println(odd);
        System.out.println(zero);
    }
}
/*
Write a program that can count the even and odd number from an
array of integers
Note: MUST use for each loop

 */