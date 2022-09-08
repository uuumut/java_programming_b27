package b25_arraysIntro;

public class arraysPractice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods",
                "iPad", "iPhone 12 case",};
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,
                439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,
                12350};
        boolean hasIpad = false;
        int glovesIndex =-1;
        for (int i = 0; i < items.length; i++) {
            if (glovesIndex==-1 && items[i].equals("Gloves")){
                glovesIndex = i;
            }
            if (!hasIpad && items[i].equals("iPad")){
               hasIpad = true;

            }

        }
        System.out.println(glovesIndex);
        System.out.println(hasIpad);
        for (int i = 0,j=0,m=0; i <items.length&&j<prices.length&&m<itemIDs.length ; i++,j++,m++) {
            if (i==j&&i==m){
                System.out.println(items[i]+"-"+prices[j]+"-"+itemIDs[m]);
            }
        }

    }
}
/*
Given the following arrays:
String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods",
"iPad", "iPhone 12 case" };
double[] prices = {99.99,      150.0,  9.99,     250.0 ,
439.50,  39.99};
int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,
12350};
1. find out the first index number of "Gloves"
2. find out if "iPad" is contained in the item list
3. Print the report of each shopping item
name - price - #ID
 */