package proxyAndFactory;

public abstract class Transport {
    private final String name;
    private final int speed;
    public Transport(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public String getName(){
        return this.name;
    }

    public int getSpeed() {
        return speed;
    }
}
