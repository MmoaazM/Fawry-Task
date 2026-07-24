package org.FawryTask.Vehicles;

import org.FawryTask.Violation;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    private final String plateNumber;
    private final String date;
    private final double speed;
    private final boolean seatbeltFastened;
    private final List<Violation> violations;

    public Vehicle(String plateNumber, String date, double speed, boolean seatbeltFastened) {
        this.plateNumber = plateNumber;
        this.date = date;
        this.speed = speed;
        this.seatbeltFastened = seatbeltFastened;
        violations = new ArrayList<>();
    }

    public String getPlateNumber() { return plateNumber; }
    public String getDate() { return date; }
    public double getSpeed() { return speed; }
    public boolean isSeatbeltFastened() { return seatbeltFastened; }

    public void addViolation(Violation v) { violations.add(v); }
    public List<Violation> getViolations() { return violations; }


    public abstract String getTypeName();
}
