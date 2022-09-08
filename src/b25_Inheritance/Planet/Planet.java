package b25_Inheritance.Planet;

public class Planet {
    public  String name, mass,surfaceGravity,surfaceArea,volume;
    public String population;
    public void setInfo(String name, String mass, String surfaceGravity, String surfaceArea, String volume, String population) {
        this.name = name;
        this.mass = mass;
        this.surfaceGravity = surfaceGravity;
        this.surfaceArea = surfaceArea;
        this.volume = volume;
        this.population = population;
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass='" + mass + '\'' +
                ", surfaceGravity=" + surfaceGravity +
                ", surfaceArea=" + surfaceArea +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }
}
