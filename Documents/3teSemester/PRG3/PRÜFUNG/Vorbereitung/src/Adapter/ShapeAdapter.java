package Adapter;

public class ShapeAdapter implements Shape {
    private Line adapteeLine;
    private Circle adapteeCircle;

    public ShapeAdapter(Line line){
        adapteeLine = line;
    }

    public ShapeAdapter(Circle circle){
        adapteeCircle = circle;
    }

    public Line getAdapteeLine(){
        return adapteeLine;
    }

    public Circle getAdapteeCircle(){
        return adapteeCircle;
    }

    @Override
    public void discription() {
        if(this.getAdapteeCircle() != null){
            this.adapteeCircle.discription();
            return;
        }
        this.getAdapteeLine().discription();
    }

    @Override
    public void perimeter() {
        if(this.getAdapteeCircle() != null){
            int per = (int)(Math.pow(this.adapteeCircle.getRadius(), 2) * Math.PI);
            System.out.println("The circle's perimeter is " + per + " cm^2");
            return;
        }
        System.out.println("The line perimeter is 0 cm^2");
    }
}
