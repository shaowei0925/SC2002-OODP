package Q2;

public class Cone extends Circle implements Shape3D{
    private double slantHeight;

    public Cone(double radius,double slantHeight){
        super(radius);
        this.slantHeight = slantHeight;
    }

    public double getSurfaceArea(){
        return super.getArea() + Math.PI*super.getRadius()*this.slantHeight;
    }

}
