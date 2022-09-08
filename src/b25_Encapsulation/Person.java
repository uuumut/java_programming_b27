package b25_Encapsulation;

public class Person {
    public String name;
    public  int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman,hasNose;
    public static int numberOfWings,numberOfHead;

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }



    static {
        planet="Earth";
        isHuman =true;
        hasNose =true;
        numberOfHead =1;
        numberOfWings=0;
    }

    public static void printPlanetName(){
        System.out.println("Planer name is"+planet);
    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }
    public void food(String food){
        System.out.println(name+" is eating "+food);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                '}';
    }
}

