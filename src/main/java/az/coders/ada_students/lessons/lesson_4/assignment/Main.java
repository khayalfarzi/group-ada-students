package az.coders.ada_students.lessons.lesson_4.assignment;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle();
        System.out.println("========> For Circle <==========");
        circle.parseFromSaveString("Circle;yellow;true;3.0");

        Shape rectangle = new Rectangle();
        System.out.println("========> For Rectangle <==========");
        rectangle.parseFromSaveString("Rectangle;black;false;10.0;20.0");

        Shape square = new Square();
        System.out.println("========> For Square <==========");
        square.parseFromSaveString("Square;purple;true;5.0");

        Shape shape = new Circle(12.45, "Red", true);
        System.out.println(shape.toString());
    }
//    public static void main(String[] args) {
//        Shape s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape
//        System.out.println(s1);
//        System.out.println(s1.getArea());
//        System.out.println(s1.getPerimeter());
//        System.out.println(s1.getColor());
//        System.out.println(s1.isFilled());
////        System.out.println(s1.getRadius()); // Explain why it does not compile.
//        // Try: ((Circle) s1).getRadius() instead. How this is different now?
//
//        Circle c1 = (Circle) s1; // Downcast back to Circle
//        System.out.println(c1);
//        System.out.println(c1.getArea());
//        System.out.println(c1.getPerimeter());
//        System.out.println(c1.getColor());
//        System.out.println(c1.isFilled());
//        System.out.println(c1.getRadius());
//
////        Shape s2 = new Shape(); // Explain why this line does not compile?
//        // Explanation
//        // Cunki abstract class larin obyekti alina bilmez, sadece ayri bir classa extend etmek olar.
//
//        Shape s3 = new Rectangle(1.0, 2.0, "red", false); // Upcast
//        System.out.println(s3);
//        System.out.println(s3.getArea());
//        System.out.println(s3.getPerimeter());
//        System.out.println(s3.getColor());
////        System.out.println(s3.getLength()); // Explain why it does not compile.
//        // Izah
//        // Cunki Shape abstract class'inin icinde getLength(); methodu yoxdur, buna gore de sol Instance Shape olduguna gore
//        // getLength() metodunu tapa bilmir. Eger biz Rectangle class'ina cast etsek o zaman instance Rectangle class'indan
//        //olduguna gore getLength(); methoduna elcatanliq mumkun olur.
//        // Try: ((Rectangle) s3).getLength() instead. How this is different now?
//
//        Rectangle r1 = (Rectangle) s3; // downcast
//        System.out.println(r1);
//        System.out.println(r1.getArea());
//        System.out.println(r1.getColor());
//        System.out.println(r1.getLength());
//
//        Shape s4 = new Square(6.6); // Upcast
//        System.out.println(s4);
//        System.out.println(s4.getArea());
//        System.out.println(s4.getColor());
//        System.out.println(s4.getSide()); // Explain why it does not compile.
//        // Try: ((Square) s4).getSide() instead. How this is different now?
//
//        // Take note that we downcast Shape s4 to Rectangle,
//        // which is a superclass of Square, instead of Square
//        Rectangle r2 = (Rectangle) s4;
//        System.out.println(r2);
//        System.out.println(r2.getArea());
//        System.out.println(r2.getColor());
//        System.out.println(r2.getSide()); // Explain why it does not compile.
//        System.out.println(r2.getLength());
//
//        // // Downcast Rectangle r2 to Square
//        Square sq1 = (Square) r2;
//        System.out.println(sq1);
//        System.out.println(sq1.getArea());
//        System.out.println(sq1.getColor());
//        System.out.println(sq1.getSide());
//        System.out.println(sq1.getLength());
//    }
}
