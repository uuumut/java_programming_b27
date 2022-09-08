package b25_ConstructorOverLoading;

public class CarObject {
    public static void main(String[] args) {
        Car car1 = new Car("toyota");
        Car car2 = new Car("honda","accord");
        Car car3 = new Car("lexus","rx350",2021);
        Car car4 = new Car("bmw","x6",2020,50000);
        Car car5 =new Car("tesla","model 3",2019,70000,"black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
