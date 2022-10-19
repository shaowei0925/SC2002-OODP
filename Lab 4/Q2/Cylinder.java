package Q2;

public class Cylinder extends Rectangle implements Shape3D{
    private double radius;

    public Cylinder(double radius, double height){
        super(2*Math.PI*radius, height);
        this.radius = radius;
    };

    public double getSurfaceArea(){
        return super.getArea() + 2*Math.PI*this.radius*this.radius;
    }
}
