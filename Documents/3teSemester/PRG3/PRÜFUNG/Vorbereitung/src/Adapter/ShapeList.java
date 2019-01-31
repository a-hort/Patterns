package Adapter;

import java.util.LinkedList;
import java.util.List;

public class ShapeList {
    List<Shape> shapes = new LinkedList<>();

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void draw(){
        shapes.stream().forEach(shape -> {shape.discription(); shape.perimeter();});
    }
}
