package b25_Inheritance2.animalTask;

public class animalObject {
    public static void main(String[] args) {
        Dog dog = new Dog("kapak","Husky",'M',4,"large","Black");
        System.out.println(dog);

        Cat cat = new Cat("bodak","short hair",'m',1,"small","yellow");
        System.out.println(cat);

        Parrot parrot =new Parrot("shabi","macow",'f',3,"small","blue","red");
        System.out.println(parrot);
    }
}
