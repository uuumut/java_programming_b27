package b25_Inheritance2;

class A{
    public A(int a){
        System.out.println("A");
    }
}
class B extends A{
    public B(){
        //  give the (super() key word) manually
        super(9);
        System.out.println("B");
    }
}

public class ConstructorPractice {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj);
    }
}
