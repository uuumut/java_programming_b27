package b25_returnMethod;

public class reverseString {
    public static void main(String[] args) {
        String str  =  "abcd";
        String reverse = reverseTheString(str);
        System.out.println(reverse);

    }

    public static String reverseTheString(String str) {
        String result = "";
        for(int i = str.length()-1;i>=0;i--){
            result += str.charAt(i);
        }
        return result;

    }
}
/*
reate a method named reverse that passes one string parameter,
the method can return the reversed string
Ex:
str = "Java";
reverse(str) ==> avaJ

 */