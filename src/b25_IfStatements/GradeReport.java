package b25_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 74;
        boolean isExcellent = score >= 90 && score <= 100;
        boolean isGreat = score >= 80 && score <= 89;
        boolean isGood = score >= 70 && score <= 79;
        boolean isPassed = score >= 60 && score <= 69;
        boolean isFailed = score >= 0 && score <= 59;
        if (score>=90) {
            System.out.println("exclent");
        }
        else if (score>=80) {
            System.out.println("great");
        }
        else if (score>=70) {
            System.out.println("good");
        }
        else if (score>=60) {
            System.out.println("passed");
        }
        else {
            System.out.println("failed");
        }

    }
}
