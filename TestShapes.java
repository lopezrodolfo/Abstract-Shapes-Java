/* 
TestShapes.java 

Tests Circle, Rectangle, and Triangle classes created from abstract Oval, Polygon, and Shape classes

Author: Rodolfo Lopez
*/

public class TestShapes extends Object {
    public static void main(String[] args) {
        Circle cir_1 = new Circle("Wheel", 4);
        Circle cir_2 = new Circle("Round", 4);
        Circle cir_3 = new Circle("Hub", 3);

        Rectangle rec_1 = new Rectangle("Plane1", 5, 2 );
        Rectangle rec_2 = new Rectangle("Plane2", 10, 5 );
        Rectangle rec_3 = new Rectangle("Plane3", 2, 4 );
        
        Triangle tri_1 = new Triangle("Trinity1", 4, 6);
        Triangle tri_2 = new Triangle("Trinity2", 10, 6);
        Triangle tri_3 = new Triangle("Trinity3", 6, 10);

        System.out.println(cir_1.toString());
        System.out.println("Area: " + cir_1.area());
        System.out.println("Perimeter: " + cir_1.perimeter());

        System.out.println(cir_2.toString());
        System.out.println("Area: " + cir_2.area());
        System.out.println("Perimeter: " + cir_2.perimeter());

        System.out.println(cir_3.toString());
        System.out.println("Area: " + cir_3.area());
        System.out.println("Perimeter: " + cir_3.perimeter());

        System.out.println(rec_1.toString());
        System.out.println("Area: " + rec_1.area());
        System.out.println("Perimeter: " + rec_1.perimeter());

        System.out.println(rec_2.toString());
        System.out.println("Area: " + rec_2.area());
        System.out.println("Perimeter: " + rec_2.perimeter());

        System.out.println(rec_3.toString());
        System.out.println("Area: " + rec_3.area());
        System.out.println("Perimeter: " + rec_3.perimeter());

        System.out.println(tri_1.toString());
        System.out.println("Area: " + tri_1.area());
        System.out.println("Perimeter: " + tri_1.perimeter());

        System.out.println(tri_2.toString());
        System.out.println("Area: " + tri_2.area());
        System.out.println("Perimeter: " + tri_2.perimeter());

        System.out.println(tri_3.toString());
        System.out.println("Area: " + tri_3.area());
        System.out.println("Perimeter: " + tri_3.perimeter());

    }
}