package b25_returnMethod;

public class frequencyOfWord {
    public static void main(String[] args) {
        String str = "mana mana mana man man ";
        String word = "mana";
        int result = frequencyOfWordInString(str,word);
        System.out.println(result);

    }

    public static int frequencyOfWordInString (String str , String word) {
        int result = 0;
        String[]arr=str.split(" ");
        for (String each : arr) {
            if (word.equals(each)){
                result++;
            }
        }
        return result;

    }
}
/*
create a method named frequencyOfWord that passes two
parameters: string sentence and String word, then returns the frequency of
word from the sentence
Ex:
sentence = "Java java java python python"
word = "java";
frequencyOfWord(sentence, word) ==>  3
 */