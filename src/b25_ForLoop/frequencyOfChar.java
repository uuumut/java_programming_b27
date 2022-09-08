package b25_ForLoop;

public class frequencyOfChar {
    public static void main(String[] args) {
        String str = "aaaabbbb";
        int frequency = 0;
        char c = 'a';
        for (int i = 0; i <str.length() ; i++) {
          char ch = str.charAt(i);
          if (c==ch){
              frequency++;
          }
        }
        System.out.println(frequency);
    }
}
