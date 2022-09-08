public class Student {
    public String name;
    public char gender;
    public int age;
    public  int ID;
    public char grade;

    public Student(String name){
        this.name=name;
    }
    public Student(String name, char gender){
        this(name);
        this.gender=gender;
    }
    public Student(String name, int ID){
        this(name);
        this.ID=ID;
    }
    public Student(String name, int ID,char grade){
        this(name,ID);
        this.grade=grade;
    }


    public Student (String name, char gender,int age){
        this(name,gender);
        this.age=age;
    }
    public Student(String name,char gender,int age,int ID){
        this(name, gender, age);
        this.ID=ID;
    }
    public  Student(String name,char gender, int age, int ID,char grade){
        this(name, gender, age, ID);
        this.grade =grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }
}
class StudentObject{
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
