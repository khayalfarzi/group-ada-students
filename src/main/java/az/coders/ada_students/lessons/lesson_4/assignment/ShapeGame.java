package az.coders.ada_students.lessons.lesson_4.assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShapeGame {

    private List<Shape> shapes;

    public ShapeGame() {
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void loadShapes(String fileName) throws IOException {

    }

    public void saveShapes(String fileName) throws IOException {

    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes(ShapeType shapeType) {
        List<Shape> shapeTypeList = new ArrayList<>();
        if (shapeType.equals(ShapeType.CIRCLE)) {
            for (Shape shape : shapes) {
                if (shape instanceof Circle)
                    shapeTypeList.add(shape);
            }
            return shapeTypeList;
        } else if (shapeType.equals(ShapeType.RECTANGLE)) {
            for (Shape shape : shapes) {
                if (shape instanceof Rectangle)
                    shapeTypeList.add(shape);
            }
            return shapeTypeList;
        } else if (shapeType.equals(ShapeType.SQUARE)) {
            for (Shape shape : shapes) {
                if (shape instanceof Square)
                    shapeTypeList.add(shape);
            }
            return shapeTypeList;
        }
        throw new RuntimeException("Shape type not found.");
    }
}
