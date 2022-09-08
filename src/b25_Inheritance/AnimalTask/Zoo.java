package b25_Inheritance.AnimalTask;

import b25_Constructor.scrumTask.Developer;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("max","husky",'m',2,"small","black");
        dog.drink();
        dog.eat();
        Cat cat = new Cat();
        cat.setInfo("bodak","shortHair",'m',2,"small","yellow");
        cat.sleep();
        cat.move();
        System.out.println(cat);
        System.out.println(dog);

    }
}
