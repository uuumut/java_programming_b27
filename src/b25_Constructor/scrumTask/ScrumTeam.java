package b25_Constructor.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO,BA,SM;
    public ArrayList<Taster>testersList=new ArrayList<>();
    public ArrayList<Developer>developersList=new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }
    public void addTester(Taster tester){
        testersList.add(tester);
    }
    public void addTesters(Taster[] tasters){
        testersList.addAll(Arrays.asList(tasters));
    }
    public void addDeveloper(Developer developer){
        developersList.add(developer);

    }
    public void addDevelopers(Developer[] developer){
        developersList.addAll(Arrays.asList(developer));
    }
    public void removeTester(int ID){
        testersList.removeIf(p-> p.ID==ID);
    }
    public void removeDeveloper(int ID){
        developersList.removeIf(p-> p.ID==ID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + developersList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
