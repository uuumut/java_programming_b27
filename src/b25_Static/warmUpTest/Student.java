package b25_Static.warmUpTest;

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
