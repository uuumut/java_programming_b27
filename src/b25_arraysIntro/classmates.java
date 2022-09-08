package b25_arraysIntro;

public class classmates {
    public static void main(String[] args) {
    String[]name= {"Black Obama","Gulmira Mamat","Umut Mamtimin","Tuma Mamtimin","Aynur kadirdin"};
    String result ="";
        for (int i = 0; i < name.length ; i++) {
            result =name[i];
            System.out.println(""+(result.charAt(0))+(result.charAt(result.indexOf(" ")+1)));
        }
    }
}
/*
create an array named classmates, and store 10 of your classmates'
full names
print the initials of each classmates in separate lines
 */