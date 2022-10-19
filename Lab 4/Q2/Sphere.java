package Q2;

public class Sphere extends Circle implements Shape3D{
    public Sphere(double radius){
        super(radius);
    }
    public double getSurfaceArea(){
        return 4*super.getArea();
    }
}
