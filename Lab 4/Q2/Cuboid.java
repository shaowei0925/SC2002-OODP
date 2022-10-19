package Q2;

public class Cuboid extends Rectangle implements Shape3D{
    private double height;
    
    public Cuboid(double length,double width,double height){
        super(length, width);
        this.height = height;
    };
    public double getSurfaceArea(){
        return 2*super.getArea() + 2*super.getLength()*height + 2*super.getWidth()*height;
    }
}