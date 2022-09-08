package b25_Inheritance2.phoneTask;

public class phoneShop {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("14max","large",1499,"black");
        iphone.faceTime(7783250665l);
        iphone.faceTime("umut@gmail.com");
        System.out.println(iphone);

        Samsung samsung =new Samsung("galaxy S19","large",900,"white");
        samsung.freeze();
        System.out.println(samsung);

        Nokia nokia = new Nokia("Brick","small",50,"gray");
        nokia.selfDefence();
        System.out.println(nokia);

        System.out.println("..............");

        iphone.call(99999);
        samsung.text(223332);

        System.out.println(iphone.hasBattery);

    }
}
