public class Cylinder extends Shape {
  private double radius, height;

  Cylinder(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }

  @Override
  public double surface_area() {
    return (2 * Math.PI * radius * height) + (2 * Math.PI *Math.pow(radius, 2));
  }

  @Override
  public double volume() {
    return Math.PI * Math.pow(radius, 2) * height;
  }

  @Override
  public String toString() {
    return  "Cylinder surface area: " + surface_area() + ", cylinder volume: " + volume() +".";
  }

}
