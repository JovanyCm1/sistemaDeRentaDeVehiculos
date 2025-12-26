package models;

public class Truck extends Vehicle {
    private double tonelage;

    public Truck(String modelo, double tarifaBase, double tonelage) {
        super(modelo, tarifaBase);
        this.tonelage = tonelage;
    }

    @Override
    public double calculate(int dias) {
        return (getTarifaBase() * dias) + (tonelage * 50 * dias);
    }

}
