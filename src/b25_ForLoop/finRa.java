package b25_ForLoop;

public class finRa {
    public static void main(String[] args) {
        for (int i =1;i<=100;i++){
            if (i%15==0){
                System.out.println("finra");
            } else if (i%3==0) {
                System.out.println("fin");

            } else if (i%2==0) {
                System.out.println("ra");

            }else {
                System.out.println(i);
            }
        }
    }
}
