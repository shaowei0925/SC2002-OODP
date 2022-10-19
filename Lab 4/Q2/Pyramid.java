package Q2;

public class Pyramid extends Triangle implements Shape3D{
    private double base2;
    public Pyramid(double height,double base1, double base2){
        super(height, base1);
        this.base2 = base2;
    }

    public double getSurfaceArea(){
        return 2*super.getArea() + super.getHeight()*this.base2 + super.getBase()*this.base2;
    }
}
