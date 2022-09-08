package b25_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class capitalOne {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setInfo("umut",23081,'m',"president",1000000,true);
        Employee employee2 = new Employee();
        employee2.setInfo("mila",23002,'f',"manager",655000,true);
        Employee employee3 = new Employee();
        employee3.setInfo("kaysar",53222,'m',"sales",45000,false);
        Employee employee4 = new Employee();
        employee4.setInfo("ali",23523,'m',"security",60000,true);
        Employee employee5 = new Employee();
        employee5.setInfo("ayhan",25352,'f',"technician",110000,true);
        Employee[]employees = {employee1,employee2,employee3,employee4,employee5};
        int fullTime =0;
        for (Employee employee : employees) {
            if(employee.isFullTime){
                fullTime++;
            }
        }
        System.out.println(fullTime);
        ArrayList<Double> salary = new ArrayList<>();
        for (Employee employee : employees) {
            salary.add(employee.salary);
        }
        double minSalary = Collections.min(salary);
        double maxSalary = Collections.max(salary);
        System.out.println("minimum salary is "+minSalary);
        System.out.println("maximum salary is "+maxSalary);







    }
}
