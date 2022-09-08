package b25_NestedIf;

import javax.swing.*;

public class GradeLevel {
    public static void main(String[] args) {
     byte gradelevel = 13;
     String result = "";
     if (gradelevel>=1 && gradelevel <= 18){
         if (1<=gradelevel && gradelevel<=5)
             result = "Elementary school";
         else if (6<=gradelevel && gradelevel<=8)
             result = "Middle school";
         else if (9<=gradelevel && gradelevel<=12)
             result = "high school";
         else  if (13<=gradelevel && gradelevel<=16)
             result = "college";
         else {
             result = "grad school";}
             }
         else { result = "INVALID";
             }
        System.out.println(result);





        /*
        Create a class called GradeLevel, Given a number(byte) grade level
determine and print which school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
For Any Other grade: Invalid grade level given
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
         */

    }
}
