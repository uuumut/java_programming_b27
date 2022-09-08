package b25_ConstructorOverLoading;

public class ConstructorCall {

    /*
    Constructor Call : this()
    1,Constructor can not be called by its name *this()* need to be used.
    2. only  a constructor can call another constructor.
    3. Constructor call must be at the first step.
    4. One constructor can not call more than one constructor.
    5. Constructor can not call or contain itself.


    this : return call instance variables & instance method
    this(): used for calling the constructors
     */


    public ConstructorCall(){
        System.out.println("DEFAULT Constructor");
    }
    public  ConstructorCall(int a){
        this();
        System.out.println("constructor with int argument");

    }
    public ConstructorCall(String str){
        this(10);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        ConstructorCall obj = new ConstructorCall();
        System.out.println(".................");
        ConstructorCall obj1 = new ConstructorCall(10);
        System.out.println("======================");
        ConstructorCall obj2 = new ConstructorCall("java");

    }




}

