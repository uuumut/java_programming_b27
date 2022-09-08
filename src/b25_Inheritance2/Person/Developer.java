package b25_Inheritance2.Person;

public class Developer extends Employee {
    public Developer(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    } // developer is an employee ad person


    public void code(){
        System.out.println(jobTitle+" "+name+" is coding");
    }
}
