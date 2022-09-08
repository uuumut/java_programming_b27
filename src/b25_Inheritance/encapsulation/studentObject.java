package b25_Inheritance.encapsulation;

public class studentObject {
    public static void main(String[] args) {
        Student student = new Student("daniel",10,'E','D',"MIT");
        student.setGender('M');
        student.setGrade('A');
        System.out.println(student);
    }
}
