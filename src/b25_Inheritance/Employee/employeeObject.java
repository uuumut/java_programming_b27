package b25_Inheritance.Employee;

public class employeeObject {
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.setInfo("umut",'m',27,12,"SDET",111111);
        tester.creatingTicket();
        System.out.println(tester);

        Developer developer = new Developer();
        developer.setInfo("mila",'f',31,11,"SD",13777);
        developer.coding();
        developer.work();
        System.out.println(developer);
    }
}
