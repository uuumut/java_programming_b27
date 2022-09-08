package b25_FinalKeyWord_ProtectedModifier;

public class Dog extends Animal {

    public Dog(String name, char breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }
    public void eat(){
        System.out.println(getName()+" is eating dog food");
    }
   // (public final void drink() )final can nor overridden
}
