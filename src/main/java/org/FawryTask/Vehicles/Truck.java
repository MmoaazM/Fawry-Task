package org.FawryTask.Vehicles;

public class Truck extends Vehicle{
    public Truck(String plateNumber, String date, double speed, boolean seatbeltFastened) {
        super(plateNumber, date, speed, seatbeltFastened);
    }

    @Override
    public String getTypeName() {
        return "Truck";
    }
}
