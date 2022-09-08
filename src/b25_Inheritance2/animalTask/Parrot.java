package b25_Inheritance2.animalTask;

public class Parrot extends Animal{

    public String wingColor;
    public Parrot(String name, String breed, char gender, int age, String size, String color,String wingColor) {
        super(name, breed, gender, age, size, color);
        this.wingColor=wingColor;
    }

    public String toString() {
        return "Parrot{" +
                "wingColor='" + wingColor + '\'' +
                '}';
    }

    public void sing(){
        System.out.println(name+" is singing");
    }
}
