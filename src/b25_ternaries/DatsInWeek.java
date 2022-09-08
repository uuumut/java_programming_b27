package b25_ternaries;

public class DatsInWeek {
    public static void main(String[] args) {
        int num = 5;
    String result = (num==1)?"monday" :(num==2)?"tuesday" :(num==3)?"wednesday"
    :(num==4)?"thursday":(num==5)?"friday":(num==6)?"saturday":"sunday";
        System.out.println(result);
    }

}
