package services;

import java.util.List;

import models.Vehicle;

public class RentalService {
    private List<Vehicle> vehiculos;

    public RentalService(List<Vehicle> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public double quoteAll(int dias) {
        double total = 0;
        for (Vehicle v : vehiculos) {
            total += v.calculate(dias);
        }
        return total;
    }
}
