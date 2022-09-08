package b25_IfStatements;

public class DayAndMonth {
    public static void main(String[] args) {
        int theMonth = 7;
        boolean isMonth1= theMonth==1 || theMonth==3 || theMonth==5
                || theMonth==7 || theMonth==8 || theMonth==10
                ||theMonth==12;
        boolean isMonth2 = theMonth==4 || theMonth==6||
                theMonth==9|| theMonth==11;
        if (isMonth1){
            System.out.println("the month has 31days");}
        if (isMonth2){
            System.out.println("the month has 30days");}
        if (theMonth==2){
            System.out.println("the month has 29days");}



    }
}
