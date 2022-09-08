package b25_Statics;

public class cydeoStudents {
    public static void main(String[] args) {
        CydeoStudent cydeoStudent1 =new CydeoStudent("umut",15,'m',1122,'a',"b27",18);
        cydeoStudent1.schoolName();
        System.out.println(cydeoStudent1);
        cydeoStudent1.study();
        cydeoStudent1.schoolName();
        cydeoStudent1.attendClass();
    }
}
