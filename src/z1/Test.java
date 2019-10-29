package z1;

public class Test {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("Skoda", 60, 9, false);
        cars[1] = new Truck("MAN", 150, 20, false, 2300);
        cars[2] = new Car("Volvo", 80, 11, false);

        for (Car car : cars) {
            System.out.println(car.getInfo());
        }

        for (int i = 0; i < cars.length; i++) {
            cars[i].setConditioner(true);
        }

        for (Car car : cars) {
            System.out.println(car.getInfo());
        }
    }
}
