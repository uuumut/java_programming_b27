package b25_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
      String name = "umut";
      int age = 15;
      String citizen = "usa";
      boolean isEligible = age>25 && citizen=="usa";
      if (isEligible) {
          System.out.println("Eligible");}

          if (!isEligible) {
              System.out.println("not true");

      }

    }
}
