package b25_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class dogObject {
    public static void main(String[] args) {
     Dog dog1 = new Dog();
     dog1.name= "lucy";
     dog1.breed="husky";
     dog1.age = 5;
     dog1.gender = 'f';
     dog1.size="small";
     dog1.color= "white";
        System.out.println(dog1);
        
     Dog dog2 = new Dog();
        dog2.name= "xax";
        dog2.breed="tedi";
        dog2.age = 4;
        dog2.gender = 'f';
        dog2.size="small";
        dog2.color= "black";
        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("jack","german shepard",6,'m',"big","black");
        System.out.println(dog3);
        Dog dog4 =new Dog();
        dog4.setInfo("moma","chuwawa",2,'m',"small","green");
        dog1.bark();
        System.out.println("=================");
        Dog[]dogs = {dog1,dog2,dog3,dog4};

        ArrayList<Dog>femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        ArrayList<Dog>maleDogs = new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf(p-> p.gender=='m');
        maleDogs.removeIf(p-> p.gender=='f');
        System.out.println(femaleDogs);
        System.out.println(maleDogs);

     
     
     
     
     
     
    }
}
