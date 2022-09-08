package b25_Recap.cydeoTask;

import b25_Recap.cydeoTask.Employee;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, int employeeID, double salary) {
        super(name, age, gender, employeeID, "Tester", salary);
    }
    public void creatTicket(){
        System.out.println(getJobTitle()+ " "+ getEmployeeID()+" is creating ticket");
    }
}
