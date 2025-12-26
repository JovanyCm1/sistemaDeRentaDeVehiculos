package models;

public class Car extends Vehicle {

    public Car(String modelo, double tarifaBase) {
        super(modelo, tarifaBase);
    }

    @Override
    public double calculate(int dias) {
        double costoBase = getTarifaBase() * dias;

        if (dias >= 7) {
            return costoBase * 0.95;
        }

        return costoBase;
    }

}
