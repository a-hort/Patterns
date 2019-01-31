package proxyAndFactory;

public abstract class Car extends Transport{

    public Car(String name, int speed){
        super(name, speed);
    }
    public void getNameCar() {
        System.out.println("Car " + " " + this.getName());
    }
}
