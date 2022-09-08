package b25_NestedIf;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 158;
        String result = "";
        if (age>0&&age<21 || 55>age&&age>=21 ||age>=55&&age<=150){
            if (age>0&&age<21)
                result= "Teenager";
            else if (55>age&&age>=21)
                result= "Adult";
            else {result= "Senior";
            }
        }else {result= "invalid";
        }
        System.out.println(result);
    }
}
/*
Create a class called AgeGroups, write a program that can define the
age groups of a person
age groups are:
Teenager (< 21)
Adult   (>=21 && <55 )
Senior ( >= 55 )
if age is negative or greater than 150, print invalid
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */
