package b25_arraysIntro;

import java.util.Arrays;

public class zeros {
    public static void main(String[] args) {
     int [] array = {10, 0, 5, 0, 1, 0};
     int [] newArray = new int[array.length];
     //iterate array by index i
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            //for each index, we check if it is 0
            if (array[i]==0){
                continue;
            }
            newArray[num++]=array[i];
            // if yes , continue

            //if not, we put this number into newArray at index j
            //and move index j to the next empty location

        }
        System.out.println(Arrays.toString(newArray));
    }
}
/*
write a program that can move all the zeros to the end of the array
Ex:
array = {10, 0, 5, 0, 1, 0}; [10,5,0,0,0]
output:
{10, 5, 1, 0, 0, 0}
 */