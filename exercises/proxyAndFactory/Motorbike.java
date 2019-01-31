package proxyAndFactory;

public abstract class Motorbike extends Transport{
    public Motorbike(String name, int speed){
        super(name, speed);
    }

    public void getNameMotorbike() {
        System.out.println("Motorbike " + " " + this.getName());
    }
}
