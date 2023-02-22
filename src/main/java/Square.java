public class Square extends GeometricObject implements Colorable {
    
    //private datafield side
    private double side;

    //no arg for square
    public Square(){
        this(0);
    }
    
   //constructor for square
    public Square(double side){
        this.side = side;
    }

     //getters and setters for side
    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side = side;
    }

    //creates a non-abstract Square with perimeter and area
    @Override
    public double getArea(){
       double area = side * side;
        return area;
    }
    @Override
    public double getPerimeter(){
        double per = side * 4;
        return per; 
    }

    //retrieved from colorable interface
    @Override
    public void howToColor(){
        System.out.print("Color all four sides") ;
    }

}

