public class Cone extends Shape {
  private double radius, height;

  Cone(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }

  @Override
  public double surface_area() {
    return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
  }

  @Override
  public double volume() {
    return Math.PI * Math.pow(radius, 2) * (height/3.0);
  }

  @Override
  public String toString() {
    return  "Cone surface area: " + surface_area() + ", cone volume: " + volume() +".";
  }

}
