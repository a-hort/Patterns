package proxyAndFactory;

public class BMWFactory implements MyFactoryProxy {
    private Car proxyCar;
    private Motorbike proxyMotorbike;
    private static int countCar = 0;
    private static int countMo = 0;

    public BMWFactory(){
        proxyCar = null;
        proxyMotorbike = null;
    }

    @Override
    public Car createCar(String name, int speed){
        if(proxyCar == null){
            proxyCar =  new BMWCar(name, speed);
            countCar++;
        }
        return proxyCar;
    }
    @Override
    public Motorbike createMotorbike(String name, int speed){
        if(proxyMotorbike == null){
            proxyMotorbike =  new BMWMotorbike(name, speed);
            countMo++;
        }
        return proxyMotorbike;
    }

    @Override
    public void number() {
        System.out.println("this BMW countCar is " + countCar);
        System.out.println("this BMW countMotorBike is " + countMo);
    }
}
