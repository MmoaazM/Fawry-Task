package org.FawryTask;

import org.FawryTask.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Fine {
    private String plateNumber;
    private List<Violation> violations;
    private double totalAmount=0;

    public Fine(Vehicle vehicle) {
        this.plateNumber = vehicle.getPlateNumber();
        this.violations = new ArrayList<>(vehicle.getViolations());

        for (Violation v : violations) {
            totalAmount += v.getFee();
        };
    }

    public String getPlateNumber() { return plateNumber; }
    public double getTotalAmount() { return totalAmount; }
    public List<Violation> getViolations() { return violations; }

    public void print() {
        System.out.println("Traffic fine for car " + plateNumber);
        System.out.println("Total amount: "+this.totalAmount+"EGP");
        System.out.println("Violations:");
        for (Violation v : violations) {
            System.out.println(v.getRuleName());
            System.out.println(v.getMessage());
            System.out.println(v.getFee());
        }
    }
}
