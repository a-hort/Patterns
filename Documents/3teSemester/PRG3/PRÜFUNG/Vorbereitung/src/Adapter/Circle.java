package Adapter;

public class Circle {
    private final String name;
    private final int radius;

    public Circle(String name, int radius){
        this.name = name;
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    private String getName(){
        return name;
    }

    public void discription() {
        System.out.println("Circle " + this.getName() + " with length " + this.getRadius());
    }
}
