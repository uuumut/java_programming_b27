package b25_Inheritance2.Person;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Business Analyst" ,id, salary, companyName);
    }
}
