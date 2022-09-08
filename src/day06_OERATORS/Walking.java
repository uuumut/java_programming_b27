package day06_OERATORS;

public class Walking {
    public static void main(String[] args) {
        double theTemperature= 19;
        String isRaining = "NO";
        boolean walkAble = theTemperature>20 && isRaining=="NO";
        if (walkAble){System.out.println("you should go for a walk");}
        if (!walkAble) {System.out.println("you cant go");}
    }
}
