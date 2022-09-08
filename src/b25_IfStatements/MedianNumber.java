package b25_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a= 17, b = 25, c=15;
        if((a>b && a<c) || (a>c && a<b) ){
            System.out.println(a + " is a median number");}
            else if ( (b>a&&b<c) || (b>c&& b<a) ) {
            System.out.println(b+ " is a medain number");}
            else if (a==b && b==c){
            System.out.println("number is equal");}
            else {
            System.out.println(c+" is a median number");}


            }


        }

