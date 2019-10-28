package z1;

public class Truck extends Car {
    private double weight;

    public Truck(String name, double tank, double consumption, boolean conditioner, double weight) {
        super(name, tank, consumption, conditioner);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    double totalConsumption() {
        double consumption = getConsumption();
        if (isConditioner()) {
            consumption += 1.6;
        }
        consumption += 0.5 * getWeight()/ 100;
        return consumption;
    }

    double range() {
        return super.range();
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", Masa ladunku: " + getWeight();
    }

    public void printInfo() {
        super.printInfo();
    }
}
