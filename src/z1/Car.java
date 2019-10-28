package z1;

public class Car extends Vehicle {
    private boolean conditioner;

    public Car(String name, double tank, double consumption, boolean conditioner) {
        super(name, tank, consumption);
        this.conditioner = conditioner;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    public void setConditioner(boolean conditioner) {
        this.conditioner = conditioner;
    }

    String ac() {
        if (conditioner) {
            return "wlaczona";
        } else return "wylaczona";
    }

    double totalConsumption() {
        double consumption = getConsumption();
        if (conditioner) {
            consumption += 0.8;
        }
        return consumption;
    }

    @Override
    double range() {
        return getTank() / totalConsumption() * 100;
    }

    @Override
    String getInfo() {
        String info = "Nazwa pojazdu: " + getName() + ", Pojemnosc baku: " + getTank() + ", Spalanie na 100km: " +
                totalConsumption() + ", Climatyzacja " + ac();
        return info;
    }

    public void printInfo() {
        System.out.print(getInfo());
        System.out.print(" Zasieg: ");
        System.out.printf("%.2f", range());
        System.out.println(" ");
    }
}
