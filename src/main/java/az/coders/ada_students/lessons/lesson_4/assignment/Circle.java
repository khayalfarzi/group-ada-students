package az.coders.ada_students.lessons.lesson_4.assignment;

public class Circle extends Shape {

    protected double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, Boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [" + super.toString() + ", radius=" + radius + "]";
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String parseToSaveString() {
        return new Circle(5.0, "blue", false).toString();
    }

    @Override
    public void parseFromSaveString(String line) {
        //Split elements from one line string [Circle;blue;false;5.0]
        String[] arr = line.split(";");

        // check data length
        if (arr.length != 4)
            System.out.println("Number of elements don't match");

        // Take arguments from array
        String color = arr[1];
        Boolean filled = Boolean.parseBoolean(arr[2]);
        Double side = Double.parseDouble(arr[3]);

        //print data
        System.out.printf("Color => %s \n", color);
        System.out.printf("Filled => %s \n", filled);
        System.out.printf("Side => %s \n", side);
    }

    // TODO - implement methods of ParsableEntity

}
