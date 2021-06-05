package az.coders.ada_students.lessons.lesson_4.assignment;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, Boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square [" + super.toString() + "]";
    }

    @Override
    public String parseToSaveString() {
        return new Square(10.0, "black", false).toString();
    }

    @Override
    public void parseFromSaveString(String line) {
        //Split elements from one line string  [ Square;red;true;3.0 ]
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
