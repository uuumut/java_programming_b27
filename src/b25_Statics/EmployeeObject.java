package b25_Statics;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "ahmat";
        employee1.salary = 122222;
        Employee employee2 = new Employee();
        employee2.name = "samat";
        employee2.salary =122121;
        System.out.println(employee1.name);
        System.out.println(employee2.name);
        System.out.println(employee1.salary);
        System.out.println(employee2.salary);
        System.out.println(employee1.isHuman=false);
        System.out.println(employee2.isHuman);
    }

}
