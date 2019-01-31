package Adapter;

public class Line {
    private final int length;
    private final String name;
    public Line(String name, int length){
        this.length = length;
        this.name = name;
    }

    private int getLength(){
        return length;
    }
    private String getName(){
        return name;
    }

    public void discription() {
        System.out.println("Line " + this.getName() + " with length " + this.getLength());
    }
}
