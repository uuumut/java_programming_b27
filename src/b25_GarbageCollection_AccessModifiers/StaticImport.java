package b25_GarbageCollection_AccessModifiers;
import static b25_GarbageCollection_AccessModifiers.Circle.pi;
import static utilites.MathUtility.*;

public class StaticImport {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
         double area = circle.radius *pi;
        System.out.println(area);

        System.out.println("===================");

        int sum1 = sumOfTwoNumbers(1,4);
        int sum2 = sumOfTwoNumbers(1,2);
        int sub = subtractionOfTwoNumbers(2,3);
        System.out.println(sub);
        System.out.println(sum1);
        System.out.println(sum2);



    }
}

/*
 Static import:
  import static packageName.className.staticMember; // import one static member of a class
  import static packageName.className.*; // import add static members of a class

 */