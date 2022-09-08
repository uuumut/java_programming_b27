package b25_GarbageCollection_AccessModifiers;

import b25_CustomClass.Dog;
import b25_Statics.Car;

public class GarbageCollection {
    public static void main(String[] args) {
        // first way by null key word

        String str ="umut";  // after line 13,"umut" will be eligible for garbage collection
            str = null;
        System.out.println(str);


        System.out.println("==================");
        // Second way
        Dog dog1 = new Dog();
        dog1.name ="lucy";
        dog1=  new Dog();
        dog1.name="max";
        System.out.println(dog1);


        /* Garbage Collection : Collection of unreferenced objects
            unreferenced object:
            1. null keyword :
            String str= "anything";
            str =null;

            2. creating a new abject:
            String str ="java";
             str= "python";


             Garbage Collector : responsible for collecting the unreferenced objects from java heap. and destroys it(finalize())



         */

    }
}
