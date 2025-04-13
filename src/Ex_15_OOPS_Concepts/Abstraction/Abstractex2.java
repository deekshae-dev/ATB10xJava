package Ex_15_OOPS_Concepts.Abstraction;

public class Abstractex2 {
    public static void main(String[] args) {
        Circle c1 = new Circle("Red", 2.2);
        c1.display();
        Rect r1 = new Rect("Yellow", 2, 4);
        r1.display();
    }
}

abstract class Shape {
    String colour;

    //constructor of abstract class
    public Shape(String colour) {
        System.out.println("shape constructor is called");
        //this keyword refers the current class variable
        this.colour = colour;
    }

    //abstract method it is implemented by child class
    abstract double area();

    void display() {
        System.out.println("Colour: " +colour);
        System.out.println("Area: " +area());
        //area is overridden in subclass
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String colour, double radius) {
        //super keyword is used to call the parent constructor
        super(colour);
        System.out.println("Circle constructor is called");
        //this keyword calls the current class variable
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

    class Rect extends Shape {
        double length;
        double width;

        public Rect(String colour, double length, double width) {
            //super keyword is used to call the parent constructor
            super(colour);
            System.out.println("Rectangle constructor is called");
            //this keyword calls the current class variable
            this.length = length;
            this.width = width;

        }

        @Override
        double area() {
            return length * width;
        }
    }