package b25_arraysIntro;

public class minNum {
    public static void main(String[] args) {
        int[]numbers = {4,5,3,7,5,4,10};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min>numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}
