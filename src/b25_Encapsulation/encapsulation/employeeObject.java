package b25_Encapsulation.encapsulation;



public class employeeObject {
    public static void main(String[] args) {
        Employee employee = new Employee("umut",'m',190,121212);
        employee.setAge(30);
        employee.setAge(employee.getAge()+18);

        System.out.println(employee);
    }
}
