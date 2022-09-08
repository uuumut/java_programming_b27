import java.util.Arrays;

public class arraysPractice2 {
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];
        // loop names with index i
        for(int i=0;i<names.length; i++){
            int score = scores[i];
            if(score>=90){
                grades[i] = 'A';
            } else if(score>=80){
                grades[i] = 'B';

            } else if(score>=70){
                grades[i] = 'C';
            } else {
                grades[i] = 'D';
            }
            System.out.println(names[i]+"score is "+scores[i]+" and grade is "+ grades[i]);

        }

        //UMUT'S CODE
//        for (int i = 0,j = 0; i < names.length&&j < scores.length; i++,j++) {
//            for (int m = 0; m < grades.length; m++) {
//              if(i==j&&i==m&&scores[j]>=90){
//                  grades[m]='A';
//                  System.out.println(names[i]+"score is "+scores[j]+" and grade is "+ grades[m]);
//              } if(i==j&&i==m&&scores[j]>=80&&scores[j]<90){
//                  grades[m]='B';
//                  System.out.println(names[i]+"score is "+scores[j]+" and grade is "+ grades[m]);
//              }if (i==j&&i==m&&scores[j]>=70&&scores[j]<80){
//                    grades[m]='C';
//                    System.out.println(names[i]+"score is "+scores[j]+" and grade is "+ grades[m]);
//                }
//
//            }
//        }
        System.out.println(Arrays.toString(grades));



    }
}
/*
given the following arrays:
      String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];
1. write a program that can store the grades of the students in
the array named grades
2. print the grade report of each students in separate lines
Ex:
Anna's score is 90, and grade is A
 */
//'A':(scores[j]>=80&&scores[j]<90)?'B':(scores[j]>=70&&scores[j]<80)?'C':(scores[j]<70&&scores[j]>=60)?'D':'F';