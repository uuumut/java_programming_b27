package b25_customMethodVoid;

public class grade {
    public static void main(String[] args) {
        gradeOfStudent(56);
    }
    public static void gradeOfStudent(double score){
        if (score>=90){
            System.out.println("A");
        }else if (score>=80){
            System.out.println("B");
        }else if (score>=70){
            System.out.println("C");
        }else if (score>=60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
/*
create a method that can calculate the grade of the student based
on the score
 */