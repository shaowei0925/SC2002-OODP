package Q2;

public class Triangle implements Shape {
  private double height;
  private double base;

  public Triangle(double height, double base) {
    this.height = height;
    this.base = base;
  }

  public double getHeight() {
    return this.height;
  }

  public double getBase() {
    return this.base;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getArea() {
    return this.height * this.base / 2;
  }
}
