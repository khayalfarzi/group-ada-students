package az.coders.ada_students.lessons.lesson_16.transport;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setVehicle("4");
        System.out.println(car.toString());

        BMW bmw = new BMW();
        bmw.setAirCondition("a");
        System.out.println(bmw.toString());

        Tesla tesla = new Tesla();
        System.out.println(tesla.toString());

        Car mercedes = new Mercedes();
        mercedes.setVehicle("7");
    }
}
