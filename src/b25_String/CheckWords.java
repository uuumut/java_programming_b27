package b25_String;

public class CheckWords {
    public static void main(String[] args) {
        String word1 = "good", word2="can",word3="momm";
        if (word1.length()==word2.length()&&word1.length()==word3.length()){
            System.out.println("same length");
        } else if (word1.length()!=word2.length()&&word1.length()!=word3.length()&&word2.length()!=word3.length()) {
            System.out.println("not same length");
        }else {
            System.out.println("Not Same nor \n" +
                    "Different lengths");
        }
    }
}
/*
Write a program  for CheckWords, the program accepts 3 words and :
- if they are same length:  print "All words are same length"
- if some same length and others not:    print "Not Same nor
Different lengths"
- if all different length :  print "All different length"
 */