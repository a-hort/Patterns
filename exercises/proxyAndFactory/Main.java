package proxyAndFactory;

public class Main {
    public static void main(String[] args) {
        BMWFactory bmw = new BMWFactory();
        Motorbike bmwMotorbike1 = bmw.createMotorbike("MotorbikeBMW", 220);
        bmwMotorbike1.getNameMotorbike();
        bmw.number();

        System.out.println("*************************");

        Motorbike bmwMotorbike2 = bmw.createMotorbike("MotorbikeBMW1", 210);
        bmwMotorbike2.getNameMotorbike();
        bmw.number();

        System.out.println("*************************");

        Car bmwCar1 = bmw.createCar("CarBMW", 220);
        bmwCar1.getNameCar();
        bmw.number();
        System.out.println("*************************");

        Car bmwCar2 = bmw.createCar("CarBMWA", 220);
        bmwCar2.getNameCar();
        bmw.number();
    }
}
