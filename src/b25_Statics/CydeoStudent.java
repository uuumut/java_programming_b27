package b25_Statics;

public class CydeoStudent {
    public String name;

    public  int age;

    public char gender;

    public int ID;

    public  char grade;

    public  String batchNumber;

    public  int groupNumber;

    public static String SchoolName = "Cydeo";

    public static String programmingLanguage = "Java";

    public CydeoStudent(String name, int age, char gender, int ID, char grade, String batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }


    public void study(){
        System.out.println(name+" is studying "+" at the"+SchoolName);
    }
    public void attendClass(){
        System.out.println(ID+" is not attending the class");
    }
    public void schoolName(){
        System.out.println(SchoolName);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ID=" + ID +
                ", grade=" + grade +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
