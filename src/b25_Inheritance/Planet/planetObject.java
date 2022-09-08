package b25_Inheritance.Planet;

public class planetObject {
    public static void main(String[] args) {
        Earth earth = new Earth();
        earth.setInfo("earth","5,970,000,000,000,000,000,000,000 Kg ","9.807 m/s²" ,"510.1 million km²","260 billion cubic miles","7.753 billion");

        System.out.println(earth);

        Moon moon = new Moon();
        moon.setInfo("moon","73500,000,000,000,000,000,000 Kg","1.62 m/s²","37.94 million square kilometres","21.9 billion cubic kilometers","none");
        System.out.println(moon);


    }
}
//260 billion cubic miles