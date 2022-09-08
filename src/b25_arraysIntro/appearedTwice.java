package b25_arraysIntro;

public class appearedTwice {
    public static void main(String[] args) {
        char[] chars = {'a', 'd', 'd', 'f', 'a', 'w', 'z', 'z', 'f', 'f', 'a', 'd'};

        String result = "";
        char ch = chars[0];
        for (int i = 0; i < chars.length; i++) {
            ch = chars[i];
            int count = 0;
            for (int j = 0; j < chars.length; j++) {
                if (ch == chars[j]) {
                    count++;

                }
            }
            if (result.contains("" + ch)) {
                continue;
            }
            if (count == 2) {
                result += ch;
            }

        }

        System.out.println(result);
        System.out.println(".....................................");
        //Second solution
        char[] chars1 = {'a', 'd', 'd', 'f', 'a', 'w', 'z', 'z', 'f', 'f', 'a', 'd'};

        String result1 = "";
        for (int i = 0; i < chars1.length; i++) {
            char ch1 = chars1[i];
            int count = 0;
            for (int j = 0; j < chars1.length; j++) {
                if (ch1 == chars[j]) {
                    count++;

                }
            }
            if (count==2){
                System.out.println(ch1);
            }
        }
    }
}