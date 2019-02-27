package Adapter;

public class AdapterMain {
//new comment
    public static void main(String[] args){
        ShapeList shapeList = new ShapeList();
        shapeList.addShape(new ShapeAdapter(new Circle("Circle1", 10)));
        shapeList.addShape(new ShapeAdapter(new Circle("Circle2", 3)));
        shapeList.addShape(new ShapeAdapter(new Circle("Circle3", 0)));
        shapeList.addShape(new ShapeAdapter(new Line("Line1", 14)));

        shapeList.draw();

    }
}
