package b25_customMethodVoid;

public class fullName {
    public static void main(String[] args) {
        fullName("guLMIra","MAMAt");


    }
    public static void fullName(String firstName,String lastName){
        String firstCha=""+ firstName.charAt(0);
        firstName =firstCha.toUpperCase()+firstName.substring(1).toLowerCase();
        String firstChaOfLastName=""+ lastName.charAt(0);
         lastName =firstChaOfLastName.toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println("\""+firstName+" "+lastName+"\"");


    }


    }
/*
write a method that can print out the full name of a person in
regular format
ex:
fullName("cYdEo", "SCHOOL");
output:
"Cydeo School"
 */