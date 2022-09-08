package b25_Recap.cydeoTask;

public class Student extends Person {

    private int studentID ;
    private String fields;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        if (studentID<0){
            System.err.println("Invalid id");
            System.exit(1);
        }
        this.studentID = studentID;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public Student(String name, int age, char gender, int studentID, String fields) {
        super(name, age, gender);
       setStudentID(studentID);
       setFields(fields);
    }

    public void study(){
        System.out.println(getStudentID()+" " +getName()+" is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name ='" + getName() + '\'' +
                ", age =" + getAge() +
                ", gender =" + getGender() +
                ", studentID =" + studentID +
                ", fields ='" + fields + '\'' +
                '}';
    }
}
