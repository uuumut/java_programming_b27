package b25_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    /*
    Access Modifiers : define the accessibility
    1.public: always reachable
    2.protected
    3.default(No Modifiers): only reachable within the same package
    4.private : only reachable within the same class

     */

    public static int publicData = 100;
    static int defaultData =200;
    private static int privateData = 300;

    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(privateData);
        System.out.println(defaultData);
    }



}
