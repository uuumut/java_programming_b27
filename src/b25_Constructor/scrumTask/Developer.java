package b25_Constructor.scrumTask;

public class Developer {
        public String name;
        public int ID;
        public String jobTitle;
        public int salary;

    public Developer(String name, int ID, String jobTitle, int salary) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
    public void coding(){
        System.out.println(name+" is coding");
    }
    public void fixingBug(){
        System.out.println(name+" is fixing bug");
    }
}
