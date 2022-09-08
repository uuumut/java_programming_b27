package b25_Inheritance2.Person;

import b25_Constructor.scrumTask.Taster;

public class AmazonInc {
    public static void main(String[] args) {
        String company = "Amazon Inc";
        ProductOwner productOwner = new ProductOwner("Suhaib",29,'m',1,160000,company);
        BusinessAnalyst businessAnalyst = new BusinessAnalyst("Cihad",30,'m',2,150000,company);
        ScrumMaster scrumMaster = new ScrumMaster("Anel",26,'f',3,145000,company);

        Tester tester1 = new Tester("Chinara",32,'f',"QA",1415,125000,company);
        Tester tester2 = new Tester("Yasaman",31,'f',"QE",1416,130000,company);
        Tester tester3 = new Tester("Cihad",26,'m',"SDET",1417,128000,company);
        Tester[]tasters = {tester1,tester2,tester3};

        Developer developer = new Developer("Daniela",27,'f',"Java Developer",8,135000,company);

        ScrumTeam scrumTeam =new ScrumTeam(productOwner,businessAnalyst,scrumMaster);
        scrumTeam.addDeveloper(developer);
        scrumTeam.addTesters(tasters);
        System.out.println(scrumTeam);

        System.out.println(".............");
        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester);
        }
        for (Developer azlak : scrumTeam.developers) {
            System.out.println(azlak.name);
        }
    }
}
