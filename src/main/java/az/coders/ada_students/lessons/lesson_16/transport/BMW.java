package az.coders.ada_students.lessons.lesson_16.transport;

public class BMW extends Car {
    private String airCondition;
    private String speed;

    public String getAirCondition() {
        return airCondition;
    }

    public void setAirCondition(String airCondition) {
        this.airCondition = airCondition;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "airCondition='" + airCondition + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}
