package day09_IfStatements;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class one {
    public static void main(String[] args) {
        System.out.println(4+"abc");
        String result = "dadaada";
      int num = result.indexOf("dad");
      String s = "cadcfcfcf man";
      int num1 = s.indexOf("dad");
        System.out.println(num1);
        System.out.println(num);
        boolean kk = s.endsWith("man");
        System.out.println(kk);
        result = result.replaceFirst("a","");
        System.out.println(result);
        String word ="hello";
        for (int w = 0; w <word.length()-1 ; w++) {
            System.out.println(word.substring(w,w+2));
        }
        int count = 0;
        for (int a = 0; a<3 ; a++) {
            for (int b = 0; b <=a ; b++) {
                count +=b;
            }
        }
        System.out.println(count);


        double[] nums = new double[4];
        nums[0]= 10.5;
        nums[2]=20.5;
        nums = new double[4];
        nums[1]=13.9;
        nums[3]= nums.length;
        System.out.println(Arrays.toString(nums));
        int n= 10;
        while (n<100){
            n *=2;
        }
        System.out.println(n);



        }
    }

