package day06_OERATORS;

public class UnaryExample {
    public static void main(String[] args) {
        int n = 2 ;
        n++;
        System.out.println(n);
    int x = 4;
    int y = x;
    int z = ++x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        int candy = 4;
        System.out.println("--candy = " + --candy);
        System.out.println("candy = " + candy--);
        System.out.println("candy = " + candy);

        int g = 2;
        int a = ++g + 10;
        System.out.println("a" + a);

        System.out.println("g = " + g);


        int h= 10;
        int f= 15;
        int w = h;
        System.out.println(h=f);
        System.out.println(f=w);

        int s = 8;
        int l= --s;
        System.out.println(s);
        System.out.println(l);
    }
}
