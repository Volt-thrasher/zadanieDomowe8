package z1;

public class Vehicle {
    private String name;
    private double tank;
    private double consumption;

    public Vehicle(String name, double tank, double consumption) {
        this.name = name;
        this.tank = tank;
        this.consumption = consumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTank() {
        return tank;
    }

    public void setTank(double tank) {
        this.tank = tank;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    double range () {
        return getTank()/getConsumption()*100;
    }

    String getInfo() {
        String info = "Nazwa pojazdu: " + getName() + ", Pojemnosc baku: " + getTank() + ", Spalanie na 100km: " +
                getConsumption();
        return info;
    }
}
