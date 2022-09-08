package b25_Statics;

public class Person {
    public String name;
    public int age;
    public  char gender;
    public static boolean isHuman = true,hasNose = true, hasWings=false;
    public static int numberOfHead = 1;
    public static int numberOfEyes = 2;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void eat(){
        System.out.println(name+" eating food!");
    }
    public void drink(){
        System.out.println(name+" is drinking !");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}



/*
Person Task:
1. Create a class named Person:
Attributes:
instance: name, age, gender
static: isHuman(boolean),
hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,
Add a constructor that can set All the
fields (instances)
Actions:
eat(String food)
drink(String drink)
sleep()
toString()
 */