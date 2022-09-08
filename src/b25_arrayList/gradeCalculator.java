package b25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class gradeCalculator {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55,
                45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores); // 90 ~100
        gradeOfA.removeIf(p-> p<90);
        int countA = gradeOfA.size();
        System.out.println("A :" + countA);

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores); // 80 ~ 89
        gradeOfB.removeIf(p-> p<80||p>=90);
        int countB = gradeOfB.size();
        System.out.println("B :" +countB);

        ArrayList<Integer> gradeOfC = new ArrayList<>(scores); // 70 ~ 79
        gradeOfC.removeIf(p-> p<70||p>=80);
        int countC = gradeOfC.size();
        System.out.println("C :" +countC);

        ArrayList<Integer> gradeOfD = new ArrayList<>(scores); // 60 ~ 69
        gradeOfD.removeIf(p-> p<60||p>=70);
        int countD = gradeOfD.size();
        System.out.println("D :" +countD);

        ArrayList<Integer> gradeOfF = new ArrayList<>(scores); // 0 ~ 59
        gradeOfF.removeIf(p-> p>=60);
        int countF = gradeOfF.size();
        System.out.println("F :" +countF);
    }
}


/*
Write a program that can count the total numbers of grade A, B, C,
D and F
 */