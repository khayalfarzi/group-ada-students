package az.coders.ada_students.lessons.lesson_16.transport;

public class Car{
    private String vehicle;

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vehicle='" + vehicle + '\'' +
                '}';
    }
}
