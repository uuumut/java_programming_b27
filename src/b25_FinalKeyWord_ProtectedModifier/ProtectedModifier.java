package b25_FinalKeyWord_ProtectedModifier;

public class ProtectedModifier {
    static String name1 = "cydeo";// default modifier can not access outside the package
    
    protected static  String name2="wooden";// protected modifier can access outside the package if is a (subclass)
}
