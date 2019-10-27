package z1;

public class Test {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("Skoda", 60, 9, false);
        cars[1] = new Truck("MAN", 150, 20, false, 2300);
        cars[2] = new Car("Volvo", 80, 11, false);

        for (Car car : cars) {
            car.printInfo();
        }

        cars[0].setConditioner(true);
        cars[1].setConditioner(true);
        cars[2].setConditioner(true);

        for (Car car : cars) {
            car.printInfo();
        }
    }
}
