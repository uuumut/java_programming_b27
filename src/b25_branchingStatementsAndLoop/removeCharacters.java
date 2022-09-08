package b25_branchingStatementsAndLoop;

public class removeCharacters {
    public static void main(String[] args) {
        String str = "aabbccdd";
        String result = "";
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if (c=='a'){
                continue;
            }
            result +=c;
        }
        System.out.println(result);

        }

    }


