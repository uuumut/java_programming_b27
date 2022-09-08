package b25_customMethodVoid;

public class eligibleToVote {
    public static void main(String[] args) {
        eligibleToVote(15,"USA");

    }
    public static void eligibleToVote (int age,String country){
    if (age>=21&& country.equals("USA")){
        System.out.println("you are  eligible to vote");
    }else {
        System.out.println("you are not eligible to vote");
    }

    }
}
/*
create a method that can check if a person is eligible to vote
Ex:
eligibleToVote(19, "USA");
output:
You are not eligible to vote!
 */