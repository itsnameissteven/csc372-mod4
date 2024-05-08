public class ShapeArray {
  public static void main(String[] args) {
    Sphere sphere = new Sphere(4);
    Cylinder cylinder = new Cylinder(6, 8);
    Cone cone = new Cone(9,5);

    Shape[] shapeArray = {sphere, cylinder, cone};

    // Loop through each shape and print shape using toString
    for(Shape shape : shapeArray) {
      System.out.println(shape.toString());
    }
  }

}
