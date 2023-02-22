public class TestSquare {
    public static void main(String[] args) {
        
        //creating the objects
        Square sq1 = new Square(3.5);
        Circle c1 = new Circle(4.5);
        Square sq2 = new Square(6);
        Rectangle r1 = new Rectangle(2, 5);
        Square sq3 = new Square(5.5);

        //putting the objects into an array
        GeometricObject[] array = {sq1, c1, sq2, r1, sq3};

        //for every object in the array
        for (GeometricObject obj: array) {

            //if the object is a rectangle
             if (obj instanceof Rectangle) {
                System.out.printf("%s%.2f%s%.2f%s%.2f%n", "Area of rectangle with width: ",
                ((Rectangle) obj).getWidth(), " and height: ",
                ((Rectangle)obj).getHeight(), " is: ",
                 obj.getArea());
            }
            
            //if the object is a circle
            if (obj instanceof Circle) {
                System.out.printf("%s%.2f%s%.2f%n", "Area of a circle with radius ",
                ((Circle)obj).getRadius(), " is ", obj.getArea());
            }

            //if the object is a square
            if (obj instanceof Square) {
                System.out.printf("%s%.2f%s%.2f%n", "Area of a square with a side of ",
                ((Square)obj).getSide(), " is ", obj.getArea());
                ((Square) obj).howToColor();
            }
        }
    }
}