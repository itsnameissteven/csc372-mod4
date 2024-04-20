public class Sphere extends Shape {
  private double radius;

  Sphere(double radius) {
    this.radius = radius;
  }

  @Override
  public double surface_area() {
    return 4 * Math.PI * Math.pow(radius, 2);
  }

  @Override
  public double volume() {
    return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
  }
  
  @Override
  public String toString() {
    return "Sphere surface area: " + surface_area() + ", sphere volume: " + volume() +".";
  }

}
