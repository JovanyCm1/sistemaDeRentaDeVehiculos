package models;

public abstract class Vehicle {
    private String modelo;
    private double tarifaBase;

    protected Vehicle(String modelo, double tarifaBase) {
        this.modelo = modelo;
        this.tarifaBase = tarifaBase;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public abstract double calculate(int dias);
}
