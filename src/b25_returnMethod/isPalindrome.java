package b25_returnMethod;

public class isPalindrome {
    public static void main(String[] args) {
       String str = "love";
       boolean isPalindrome = isPalindrome(str);
        System.out.println(isPalindrome);

    }

    public static boolean isPalindrome(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
       boolean isPalindrome = result.equals(str);
        return isPalindrome;
    }
}
/*
\By using the reverse method above to create another method named
isPalindrome  that passes a String parameter, the method returns true if
the string is palindrome, otherwise returns false
Ex:
str = "Level"
isPalindrome(str) ===> true
 */