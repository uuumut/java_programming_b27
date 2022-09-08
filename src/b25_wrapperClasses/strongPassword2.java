package b25_wrapperClasses;

public class strongPassword2 {
    public static void main(String[] args) {
        String password="cydeoL1990@";
        int countUpperCase= 0;
        int countLowerCase= 0;
        int countDigits= 0;
        int countSpecialChar= 0;
        for (int i = 0; i <password.length() ; i++) {
            char each =password.charAt(i);
            if(Character.isUpperCase(each)){
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            } else if(Character.isDigit(each)) {
                countDigits++;
            }else {
                countSpecialChar++;
            }

        }
        boolean isStrongPassword=countDigits>0&&countLowerCase>0&&countUpperCase>0&&countSpecialChar>0&&password.length()>=8&& !password.contains(" ");
        System.out.println(isStrongPassword);


    }
}
