package b25_NestedIf;

public class Grade {
    public static void main(String[] args) {
        char grade  ='c';
        String result = "";
        if (grade>='a'||grade<='d'||grade=='f'){
            if (grade == 'a')
                result= "excellent";
            else if (grade=='b')
                result="great job";
            else if (grade=='c')
                result="good";
            else if (grade=='d')
                result="passed";
            else {
                result="failed";}

        }else{result = "invalid";

        }
        System.out.println(result);

    }
}
/*
Create a class called Grade, a char variable named grade is given.
write a program to print the following messages:
'A': excellent
'B': great job
'C': good
'D': passed
'F': failed
other wise: invalid
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */