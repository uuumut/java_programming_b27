package b25_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("umut");
    }
    static { // runs first,and only runs one time
        System.out.println("mila");
    }

}
/* Static block : used for initializing static variables
                  gets executed as soon as the class is loaded
                  runs first before everything, only runs one time

 */