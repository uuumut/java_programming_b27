package b25_ternaries;

public class withNestedIf {
    public static void main(String[] args) {
        int s = 85;
       String result = (s>=0&&s<=100)?(s>=60)?"passed" :"FAILED":"INVALID";
        System.out.println("result = " + result);



    }

}
