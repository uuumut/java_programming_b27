package b25_Encapsulation;

public class CydeoStudent {
    public String name;
    public  char gender;
    public  int age;
    public  int batchNumber;
    public  int groupNumber;
    public static  String schoolName;
    public String fieldOfStudy;
    public static String  programmingLanguage;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }
    static {
        schoolName ="Cydeo";
        programmingLanguage="Java";

    }
    public static void schoolName(){
        System.out.println(schoolName);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", School='" + schoolName + '\'' +
                ", programming language='" + programmingLanguage + '\'' +
                '}';
    }
}
