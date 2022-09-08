package b25_GarbageCollection_AccessModifiers;

public class StaticMembers {
    // only inner class can be a static
   static class class1{

   }


    public static  int num =100;

    public static void  method(){

    }


}

// nasted class(only a inner class can call by static)
class a{ //outer class

    static class B{ //inner class
        public static void method1(){

        }

    }
}

class c{
    public static void main(String[] args) {
        a.B.method1();
    }
}




