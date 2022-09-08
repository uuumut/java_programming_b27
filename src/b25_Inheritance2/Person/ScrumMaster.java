package b25_Inheritance2.Person;

public class ScrumMaster  extends  Employee{
    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", id, salary, companyName);
    }
}
