package b25_ConstructorOverLoading;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1 = new Employee("umut");
         employee1= new Employee(employee1.name,'m');
        Employee employee3= new Employee("ahmat",'m',"sdet");

        System.out.println(employee1);

        System.out.println(employee3);

    }
}
