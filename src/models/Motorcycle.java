package models;

public class Motorcycle extends Vehicle {

    public Motorcycle(String modelo, double tarifaBase) {
        super(modelo, tarifaBase);
    }

    @Override
    public double calculate(int dias) {
        double costoBase = getTarifaBase() * dias;

        if (dias > 3) {
            return costoBase - 20;
        }

        return costoBase;
    }

}
