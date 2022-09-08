package practice;

public class Test {
    static  void  run(){
        System.out.print(1);
    }

    public static void main(String[] args) {
        Test.run();
        System.out.print(2);
    }
    public Test(){
        System.out.print(3);
    }
    static {
        System.out.print(4);
    }
}
