package b25_returnMethod;

public class frequencyOfTheNumberInArray {
    public static void main(String[] args) {
        int[] arr = {4,4,2,4,2,4,4,2,5,6,7,5};
        int num = 5;
        int frequency = frequencyOfTheNumber(arr,num);
        System.out.println(frequency);
    }
    public static int frequencyOfTheNumber(int[]arr,int num){
        int count= 0;
        for (int i : arr) {
            if (num==i){
                count++;
            }
        }
        return count;
    }
}
