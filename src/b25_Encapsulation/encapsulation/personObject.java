package b25_Encapsulation.encapsulation;

public class personObject {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(56);
        p1.setName("umut");
        System.out.println("age is" +p1.getAge()+"name is "+ p1.getName());
    }
}
