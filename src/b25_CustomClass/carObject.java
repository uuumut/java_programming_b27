package b25_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class carObject {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setInfo("audi","q5","blue",2022,59999.99);
        System.out.println(car1);
        car1.drive();
        Car car2 = new Car();
        car2.setInfo("toyota","4runner","red",2017,55000);
        System.out.println(car2);
        car2.start();
        Car car3 = new Car();
        car3.setInfo("bmw","x3","white",2006,5000);
        ArrayList<Car>carsList =new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));
        System.out.println(carsList);
        for (Car car : carsList) {
            System.out.println(car.brand+car.price);

        }

        /*
        recall
        bmw : 2005-2008
        toyota: 1995-1997
         */
        carsList.removeIf(p-> p.brand.equals("bmw")&&p.year>=2005&&p.year<=2008);
        carsList.removeIf(p-> p.brand.equals("toyota")&&p.year>=1995&&p.year<=1997);
        System.out.println(carsList);


    }
}
