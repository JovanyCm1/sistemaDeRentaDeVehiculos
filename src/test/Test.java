package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Motorcycle;
import models.Vehicle;
import services.RentalService;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new models.Car("Ford", 40.0));
        vehicles.add(new models.Truck("Volvo", 100.0, 5.0));
        vehicles.add(new Motorcycle("Honda", 30.0));
        RentalService rentalService = new RentalService(vehicles);
        System.out.print("Ingrese el número de días de alquiler: ");
        int dias = sc.nextInt();
        double totalQuote = rentalService.quoteAll(dias);
        System.out.printf("La cotización total para " + dias + " días es: $%.2f%n", totalQuote);
        sc.close();
        
        
    }

}
