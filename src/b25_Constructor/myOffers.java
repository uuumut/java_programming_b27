package b25_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class myOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.setInfo("VA","Amozon Inc","SDET",110000,true,true,true,true);
        Offer offer2 = new Offer();
        offer2.setInfo("CA","Sony Inc","QA",120000,true,false,false,true);
        Offer offer3 = new Offer();
        offer3.setInfo("FL","Apple Inc","QE",125000,true,true,true,false);
        Offer offer4 = new Offer();
        offer4.setInfo("TX","CapitalOne","SM",115000,false,false,true,true);
        Offer offer5 = new Offer();
        offer5.setInfo("WA","BOA","BA",130000,true,true,false,true);

       Offer[]myOffers = {offer1,offer2,offer3,offer4,offer5};
        ArrayList<Offer>fullTimeList = new ArrayList<>(Arrays.asList(myOffers));
        System.out.println(fullTimeList.size());
        fullTimeList.removeIf(p-> !p.isFullTime);
        System.out.println(fullTimeList.size());
        ArrayList<Offer>localOffer = new ArrayList<>(Arrays.asList(myOffers));
        localOffer.removeIf(p-> !p.location.equals("VA"));
        System.out.println(localOffer.size());


    }
}
