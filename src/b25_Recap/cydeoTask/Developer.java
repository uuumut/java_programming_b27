package b25_Recap.cydeoTask;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, int employeeID,  double salary) {
        super(name, age, gender, employeeID, "Developer", salary);
    }
    public void fixingBug(){
        System.out.println(getJobTitle()+" "+ getEmployeeID()+" is fixing bug");
    }
}
