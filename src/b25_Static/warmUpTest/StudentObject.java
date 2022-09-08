package b25_Static.warmUpTest;

public class StudentObject {
    public static void main(String[] args) {
        Student student1 = new Student("ahmet");
        Student student2 = new Student("aygun",'f');
        Student student3 = new Student("nigara",11);
        Student student4 = new Student("adil",12,'a');
        Student student5 = new Student("mert",'m',28);
        Student student6 = new Student("cihat",'m',30,1223);
        Student student7 = new Student("maymun",'f',23,1111,'f');

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);

    }

}
