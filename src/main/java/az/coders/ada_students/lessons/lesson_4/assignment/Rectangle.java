package az.coders.ada_students.lessons.lesson_4.assignment;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, Boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle [" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String parseToSaveString() {
        return new Rectangle(10.0, 20.0, "black", true).toString();
    }

    @Override
    public void parseFromSaveString(String line) {
        //Split elements from one line string [Rectangle;cyan;true;5.0;5.0]
        String[] arr = line.split(";");

        // check data length
        if (arr.length != 5)
            System.out.println("Number of elements don't match");

        // Take arguments from array
        String color = arr[1];
        Boolean filled = Boolean.parseBoolean(arr[2]);
        Double width = Double.parseDouble(arr[3]);
        Double length = Double.parseDouble(arr[4]);

        //print data
        System.out.printf("Color => %s \n", color);
        System.out.printf("Filled => %s \n", filled);
        System.out.printf("Width => %s \n", width);
        System.out.printf("Length => %s \n", length);
    }

    // TODO - implement methods of ParsableEntity

}
