package proxyAndFactory;

interface MyFactoryProxy extends Count{

    abstract Car createCar(String name, int speed);
    abstract Motorbike createMotorbike(String name, int speed);
}
