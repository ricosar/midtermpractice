
public class Circle extends GeometricObject {

    //datafield radius
    private double radius;
    private double sup;
    public double change2;

    //arg and no arg constructors
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
        this.sup = sup;
        this.change2 = change2;
    }
    
    // Return radius 
    public double getRadius() {
        return radius;
    }

    // Set a new radius 
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override // Return area 
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Return diameter 
    public double getDiameter() {
        return 2 * radius;
    }

    @Override // Return perimeter 
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
   
    //Print the circle info 
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
        " and the radius is " + radius);
    }

    //to string method overwritten
    @Override
    public String toString() {
        return "Circle";
    }
    }
