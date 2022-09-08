package b25_Recap.cydeoTask;



public class Cydeo {
    public static void main(String[] args) {
        Student student = new Student("umut",27,'m',77,"tester");
        System.out.println(student);
        student.study();
        Tester tester = new Tester("azmat",33,'m',199,111111);
        System.out.println(tester);
        tester.creatTicket();
        Developer developer = new Developer("mila",18,'f',02,300000);
        System.out.println(developer);
        developer.fixingBug();
        Teacher teacher = new Teacher("hh",22,'m',78,141441);
        System.out.println(teacher);
        teacher.work();
    }
}
