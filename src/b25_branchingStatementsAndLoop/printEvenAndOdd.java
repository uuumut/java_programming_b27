package b25_branchingStatementsAndLoop;

public class printEvenAndOdd {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println(".........");
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}
