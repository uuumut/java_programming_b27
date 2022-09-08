package b25_customMethodVoid;

public class printEachChar {
    public static void main(String[] args) {
        printTheCharacters("fuc you motherfucker");

    }
    public static  void  printTheCharacters(String str){

        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));
        }
    }
}
/*
create a method named printEachChar that can print each
characters of a string
 */