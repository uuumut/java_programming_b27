package b25_GarbageCollection_AccessModifiers;

public class CydeoStudent {
    public String studentName;
    public static String schoolName;
    public CydeoStudent(String studentName){
        this.studentName= studentName;

    }
    static {
        schoolName = "Cydeo";
    }
}

class CydeoStudentObject{
    public static void main(String[] args) {
        CydeoStudent cydeoStudent1 = new CydeoStudent("umut");
        CydeoStudent cydeoStudent2 = new CydeoStudent("mila");
        System.out.println(cydeoStudent1.schoolName);
        System.out.println(cydeoStudent2.schoolName);
    }
}