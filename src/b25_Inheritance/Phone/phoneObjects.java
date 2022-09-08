package b25_Inheritance.Phone;

public class phoneObjects {
    public static void main(String[] args) {

        Iphone iphone =new Iphone();
        iphone.setInfo("iphone","14max","large",1499);
        iphone.call(7783250665L);
        iphone.faceTime("umut19950123@gmail.com");
        System.out.println(iphone);

        System.out.println(",,,,,,,,,,,,,");

        Samsung samsung =  new Samsung();
        samsung.setInfo("samsung","galxy","small",999);
        samsung.freeze();
        samsung.text(7783260665L);
        System.out.println(samsung);
        System.out.println(">>>>>>>>>>>>>>>>>>");
        Nokia nokia = new Nokia();
        nokia.setInfo("Nokia","8800","small",1111);
        nokia.selfDefence();
        System.out.println(nokia);

    }

    }

