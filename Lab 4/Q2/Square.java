package Q2;

public class Square extends Rectangle {

  public Square(double length) {
    super(length, length);
  }

  public double getLength() {
    return super.getLength();
  }

  public void setLength(double length) {
    super.setLength(length);
    super.setWidth(length);
  }

}
