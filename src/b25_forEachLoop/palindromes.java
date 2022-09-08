package b25_forEachLoop;

public class palindromes {
    public static void main(String[] args) {
        String [] str = {"anna", "level", "Java","mom","dad","kala"};

        int count = 0;
        for (String each : str) {
            String newWord = "";
            for (int i = each.length()-1; i>=0  ; i--) {
                newWord +=each.charAt(i);
                if (newWord.equals(each)){
                    count +=1;
            }

            }
        }
        System.out.println(count);
    }
}
/*
write a program that can count how many palindromes in an array of
string
Ex:
{"anna", "level", "Java"};
output:
2
 */