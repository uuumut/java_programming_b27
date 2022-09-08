package day06_OERATORS;

public class GiftCard {
    public static void main(String[] args) {
       int giftCard= 500;
       int usedTimes= 3;
       int firstTime = 150;
       int secondTime = 99;
        System.out.println("After first time used the gift card.The value of the gift card is: "+ (giftCard-firstTime));
        System.out.println("The used times left:"+ --usedTimes);
        System.out.println("After second time used gift card. The value of the card is: "+ (giftCard-firstTime-secondTime));
        System.out.println("The used times left: "+ --usedTimes);
       /*
        declare and assign a gift card variable at 500
    declare and assign times used at 3
    print using giftcard and subtract 150 from the amount
    reduce the times used by one
    print using giftcard and subtract 99 from the amount
    reduce the time used by one
    print information at the end

        */


    }

}
