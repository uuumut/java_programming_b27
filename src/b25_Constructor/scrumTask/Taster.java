package b25_Constructor.scrumTask;

public class Taster {
    public String name;
    public int ID;
    public String jobTitle;
    public int salary;

    public Taster(String name, int ID, String jobTitle, int salary) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Taster{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+ "is smoke testing");
    }
    public void  creatingTicket(){
        System.out.println(name+ "is creating ticket");
    }
}
