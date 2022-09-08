package b25_Constructor.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class myScrumTeam {
    public static void main(String[] args) {
        Taster taster1 = new Taster("umut",1345,"SDET",125000);
        Taster taster2 = new Taster("muhtar",1424,"SDET",110000);
        Taster taster3 = new Taster("asiya",1213,"SDET",115000);
        Taster[] testers = {taster1,taster2,taster3};

        Developer developer  =new Developer("adil",1231,"Java Dev",125000);
        Developer developer1=new Developer("asat",1253,"Java Master",185000);
        Developer developer2=new Developer("yasin",1299,"SD",135000);
        Developer developer3=new Developer("saim",1111,"Senior Dev",200000);
        Developer[] developers={developer,developer1,developer2,developer3};

        ScrumTeam scrum= new ScrumTeam("nigara","husayin","neira",14);
        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("-------------------");
        for (Taster taster : scrum.testersList) {
            System.out.println(taster.name+" : "+taster.salary);
        }
        System.out.println("--------------------");
        for (Developer Dev : scrum.developersList) {
            System.out.println(Dev.name+" : "+Dev.salary);
        }
        System.out.println("---------------------");
        scrum.removeTester(1424);
        scrum.removeDeveloper(1231);
        System.out.println(scrum);


    }
}
