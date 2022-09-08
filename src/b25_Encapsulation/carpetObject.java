package b25_Encapsulation;

public class carpetObject {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(4.9,2,10,false);
        carpet.setLength(-9);
        System.out.println(carpet);
    }
}
