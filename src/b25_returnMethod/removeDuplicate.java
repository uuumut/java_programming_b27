package b25_returnMethod;

public class removeDuplicate {
    public static void main(String[] args) {
        String removeDuplicate = removeDuplicate("aaafffbbbeeee");
        System.out.println(removeDuplicate);

    }

    public static String removeDuplicate(String str){
        String result = "";
        for (int i = 0; i <str.length() ; i++) {
            if (!result.contains(""+ str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        return result;
    }
}
/*\
create a method that can remove duplciated characters from a
string and returns the new value
"aaabbcccc" ===> "abc"

 */