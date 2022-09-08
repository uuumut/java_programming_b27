package b25_ForLoop;

public class frequency {
    public static void main(String[] args) {
        String str = "mila mila mila mila";
        String target = "mila";
        int num = 0;
        for (int i=0; i<str.length();i++){
            int indexS = str.indexOf(' ',i);
            String word = indexS==-1?str.substring(i):str.substring(i, indexS);
            if (word.equals(target)){
                num +=1;
            }
        }
        System.out.println(num);
    }
}
/*
write a program that can return the frequency of the a word Java from
the sentence
Ex:
sentence = "Java Java";
output:
2
 */