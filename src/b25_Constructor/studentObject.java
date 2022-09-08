package b25_Constructor;

import b25_Constructor.Student;

public class studentObject {
    public static void main(String[] args) {
        Student student1 = new Student("adil",22,'m','d',14);
        Student student2 = new Student("askar",25,'m','c',19);
        System.out.println(student1);
        System.out.println(student2);
    }
}
