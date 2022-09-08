package b25_CustomClass;

import java.util.ArrayList;

public class studentObject {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setInfo("aygun",'f',39,2210,'a');
        Student student2 = new Student();
        student2.setInfo("hulya",'f',26,2123,'b');
        Student student3 = new Student();
        student3.setInfo("ali",'m',28,5511,'b');
        Student student4 = new Student();
        student4.setInfo("mert",'m',26,2252,'c');

        Student[]students={student1,student2,student3,student4};
        for (Student student : students) {
            System.out.println(student);
        }
        ArrayList<Student>earlyBirds = new ArrayList<>();
        ArrayList<Student>angryBirds =new ArrayList<>();
        for (Student student : students) {
            if (student.grade=='a'){
                earlyBirds.add(student);
            }else {
                angryBirds.add(student);
            }
        }
        System.out.println(earlyBirds);
        System.out.println(angryBirds);





    }
}
