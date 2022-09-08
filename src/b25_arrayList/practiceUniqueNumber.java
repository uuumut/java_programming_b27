package b25_arrayList;


import java.util.ArrayList;

public class practiceUniqueNumber {
    public static void main(String[] args) {
        //if indexOf number equal to lastIndexOf number then the element is unique number
      ArrayList<String>str=new ArrayList<>();
      str.add("java");
      str.add("python");
      str.add("java");
      str.add("c#");
      str.add("c#");
        for (String each : str) {
            if (str.indexOf(each)==str.lastIndexOf(each)){
                System.out.println(each);
            }
        }

    }

}
