public class Sphere extends Shape {
  private double radius;

  Sphere(double radius) {
    this.radius = radius;
  }

  // Returns the surface area of a sphere
  @Override
  public double surface_area() {
    return 4 * Math.PI * Math.pow(radius, 2);
  }

  // Returns the volume of a sphere
  @Override
  public double volume() {
    return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
  }
  
  // Prints out the surface area and volume
  @Override
  public String toString() {
    return "Sphere surface area: " + surface_area() + ", sphere volume: " + volume() +".";
  }

}
