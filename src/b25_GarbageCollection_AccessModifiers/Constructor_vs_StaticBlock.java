package b25_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {
    static {
        System.out.println("Static block");
    }
    public Constructor_vs_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }
}

